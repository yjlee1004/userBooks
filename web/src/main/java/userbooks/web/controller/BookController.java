package userbooks.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import userbooks.dto.BookDto;
import userbooks.dto.SearchWordDto;
import userbooks.dto.UserSession;
import userbooks.service.search.SearchHistoryException;
import userbooks.util.BooksPage;
import userbooks.util.BooksPageImpl;
import userbooks.util.HttpUtil;

import javax.servlet.http.HttpSession;
import java.util.*;


/**
 * Created by yjlee on 2018-07-13.
 */

@Controller
@Slf4j
public class BookController {

    @Autowired
    HttpSession httpSession;

    @GetMapping("/search")
    public ModelAndView search(String searchWord,@PageableDefault(size = 10) Pageable pageable){

        UserSession userSession = (UserSession) httpSession.getAttribute(HttpUtil.USER_SESSION_NAME);

        log.info(" userSession : " + userSession);

        List<BookDto> bookDtos = new ArrayList<>();
        Page<BookDto> pages = new PageImpl<>(bookDtos,pageable,11);

        BooksPage<BookDto> bookDtoBooksPage = new BooksPageImpl<>(bookDtos,pages);

        ModelAndView modelAndView = new ModelAndView("books/search");
        modelAndView.addObject("pagedata",bookDtoBooksPage);

        return modelAndView;
    }


    @PostMapping("/history")
    @ResponseBody
    public List<SearchWordDto> history(@RequestBody String  searchKey){
        try {
            return Arrays.asList(new SearchWordDto(0, "aaa"), new SearchWordDto(1, "aab"));
        }catch (SearchHistoryException e){
            return new ArrayList<>();
        }catch (Exception e){
            return new ArrayList<>();
        }

    }
}

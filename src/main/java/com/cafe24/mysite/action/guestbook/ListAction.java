package com.cafe24.mysite.action.guestbook;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cafe24.mysite.dao.GuestBookDao;
import com.cafe24.mysite.vo.GuestBookVo;
import com.cafe24.web.WebUtil;
import com.cafe24.web.mvc.Action;

public class ListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GuestBookDao dao = new GuestBookDao();
		List<GuestBookVo> list = dao.getList();
		
		request.setAttribute("list", list);
		WebUtil.forward(request, response, "/WEB-INF/views/guestbook/list.jsp");

	}

}

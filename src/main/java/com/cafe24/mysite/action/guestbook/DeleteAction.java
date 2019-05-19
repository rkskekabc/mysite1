package com.cafe24.mysite.action.guestbook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cafe24.mysite.dao.GuestBookDao;
import com.cafe24.mysite.vo.GuestBookVo;
import com.cafe24.web.WebUtil;
import com.cafe24.web.mvc.Action;

public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		String password = request.getParameter("password");
		
		GuestBookVo vo = new GuestBookVo();
		vo.setNo(Long.parseLong(no));
		vo.setPassword(password);
		
		new GuestBookDao().delete(vo);
		WebUtil.redirect(request, response, request.getContextPath() + "/guestbook");
	}

}

package in.blod.dao;

import java.util.List;

import in.blog.pojo.myblog;


public interface myblogdao {
	boolean insert(myblog blogobj);
	boolean update(myblog blogobj);
	boolean delete(int blogid);
	List<myblog> myblogList();
	myblog searchblogById(int blogid);
	myblog searchblogByEmail(String customeremail);
}

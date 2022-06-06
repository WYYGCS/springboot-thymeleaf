package com.ruanko.entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 新闻文章<br>
 * 新闻即文章，文章即新闻，有点混了
 * 
 * @author
 *
 */
@Entity
@Table(name = "article")
public class Article {
	/**
	 * 编号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 作者
	 */
	private String author;
	/**
	 * 内容
	 */
	private String content;
	//创建时间
	private String timecreate;
//	更新时间/**/
	private String timeupdate;

	public Article(String test, String wyy, String s, String s1, String s2) {
	}

	@Override
	public String toString() {
		return "Article{" +
				"id=" + id +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				", content='" + content + '\'' +
				", timecreate='" + timecreate + '\'' +
				", timeupdate='" + timeupdate + '\'' +
				'}';
	}

	public Article() {

	}

	public String getAuthor() {return author; }
	public void setAuthor(String author) {
		this.author = author;
	}
	//------------------------------------------------------------------------------
	public String getContent() { return content; }
	public void setContent(String content) {
		this.content = content;
	}
	//------------------------------------------------------------------------------
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//------------------------------------------------------------------------------
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//-------------------------------------------------------------------------------------------------
	// 获得当前日期
	public String getCurDate(){
		Date d = new Date();
		return dateToStr(d);
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// String dateNowStr = sdf.format(d);
		// return dateNowStr;
	}

	/**
	 * 将Date对象转换为yyyy-MM-dd HH:mm:ss字符串
	 *
	 * @param d
	 * @return
	 */
	public String dateToStr(Date d){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateNowStr = sdf.format(d);
		return dateNowStr;
	}
	//------------------------------------------------------------------------------
	public String getTimecreate() { return timecreate; }
	public void setTimecreate(String timecreate) {
		if(timecreate == null) this.timecreate= getCurDate();
		else this.timecreate=timecreate;

	}
	public void setTimecreate1() {
		this.timecreate= timecreate;
	}
	//------------------------------------------------------------------------------
	public String getTimeupdate() {
		return timeupdate;
	}
	public void setTimeupdate(String timeupdate) {
		if (timeupdate==null) this.timeupdate=getCurDate();
		else this.timeupdate=timeupdate;
	}
	public void setNull(){
		this.timeupdate=null;
	}
}

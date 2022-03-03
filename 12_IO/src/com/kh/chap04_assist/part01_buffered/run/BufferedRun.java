package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.vo.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		BufferedDao bd=new BufferedDao();
		//bd.fileSave();
		bd.fileRead();
	}

}

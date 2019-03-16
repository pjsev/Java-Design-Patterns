package com.dp.strategy;

import java.io.File;
import java.util.ArrayList;

public class Client {
	
	
	static ArrayList<File> fileList;
	
	public static void main(String[] args) {
		CompressionContext ctx = new CompressionContext();
		ctx.setCompressionStrategy(new ZipCompressionStrategy());
		ctx.createArchive(fileList);
	}
}

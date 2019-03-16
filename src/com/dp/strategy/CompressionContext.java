package com.dp.strategy;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {
	
	private CompressionStrategy strategy;
	
	public void setCompressionStrategy(CompressionStrategy strategy) {
		this.strategy = strategy;
	}
	
	// use the strategy
	public void createArchive(ArrayList<File> files) {
		strategy.compressFiles(files);
	}
}

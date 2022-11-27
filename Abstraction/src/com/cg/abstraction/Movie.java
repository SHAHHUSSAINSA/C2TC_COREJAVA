package com.cg.abstraction;
import java.util.*;

public abstract class Movie {
	String title;

	abstract void setTitle(String s);

	}

	class Mymovie extends Movie{

	void setTitle(String s){

	title = s;

	}

	String getTitle(){

	return title;

	}

	}
    

		
	


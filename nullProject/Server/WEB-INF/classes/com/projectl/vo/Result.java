package com.projectl.vo;

import java.util.ArrayList;

public class Result {

	//json???Όλ‘? ArrayListμ»¬λ ?? μΆλ ₯λ°©μ? λ³?κ²½νκΈ? ??΄ ??± [?? {λ‘?
		private int count; //λͺκ°? κ°μ ??±?΄? return ??μ§? ? λ³?
		private String status; // ??± ?±κ³΅κ³Ό ?€?¨ ? λ³?
		private ArrayList<Exhi> list;
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<Exhi> getList() {
		return list;
	}

	public void setList(ArrayList<Exhi> list) {
		this.list = list;
	}



	@Override
	public String toString() {
		return "Result [count=" + count + ", status=" + status + ", list=" + list + "]";
	}

}

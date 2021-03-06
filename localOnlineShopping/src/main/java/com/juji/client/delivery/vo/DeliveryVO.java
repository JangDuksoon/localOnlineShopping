package com.juji.client.delivery.vo;

import com.juji.client.common.vo.CommonVO;

public class DeliveryVO extends CommonVO {
	private int o_serialnum;
	private String p_num;
	private String id;
	private String o_date;
	private String o_status;
	private String o_address;
	private String o_tel;
	private int o_quantity;
	private int o_totalprice;
	private int o_price;
	private String o_num;
	private String o_reciever;
	private String o_reciever_number;
	private String o_delivery;
	private String o_image;
	private String o_product;
	private String o_paymethod;
	private String o_confirm;

	public String getO_confirm() {
		return o_confirm;
	}

	public void setO_confirm(String o_confirm) {
		this.o_confirm = o_confirm;
	}

	public String getO_date() {
		return o_date;
	}

	public void setO_date(String o_date) {
		this.o_date = o_date;
	}

	public String getO_delivery() {
		return o_delivery;
	}

	public void setO_delivery(String o_delivery) {
		this.o_delivery = o_delivery;
	}

	public String getO_paymethod() {
		return o_paymethod;
	}

	public void setO_paymethod(String o_paymethod) {
		this.o_paymethod = o_paymethod;
	}

	public String getO_product() {
		return o_product;
	}

	public void setO_product(String o_product) {
		this.o_product = o_product;
	}

	public String getO_image() {
		return o_image;
	}

	public void setO_image(String o_image) {
		this.o_image = o_image;
	}

	public int getO_serialnum() {
		return o_serialnum;
	}

	public void setO_serialnum(int o_serialnum) {
		this.o_serialnum = o_serialnum;
	}

	public String getP_num() {
		return p_num;
	}

	public void setP_num(String p_num) {
		this.p_num = p_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getO_status() {
		return o_status;
	}

	public void setO_status(String o_status) {
		this.o_status = o_status;
	}

	public String getO_address() {
		return o_address;
	}

	public void setO_address(String address) {
		this.o_address = address;
	}

	public String getO_tel() {
		return o_tel;
	}

	public void setO_tel(String o_tel) {
		this.o_tel = o_tel;
	}

	public int getO_quantity() {
		return o_quantity;
	}

	public void setO_quantity(int o_quantity) {
		this.o_quantity = o_quantity;
	}

	public int getO_totalprice() {
		return o_totalprice;
	}

	public void setO_totalprice(int o_totalprice) {
		this.o_totalprice = o_totalprice;
	}

	public int getO_price() {
		return o_price;
	}

	public void setO_price(int o_price) {
		this.o_price = o_price;
	}

	public String getO_num() {
		return o_num;
	}

	public void setO_num(String o_num) {
		this.o_num = o_num;
	}

	public String getO_reciever() {
		return o_reciever;
	}

	public void setO_reciever(String o_reciever) {
		this.o_reciever = o_reciever;
	}

	public String getO_reciever_number() {
		return o_reciever_number;
	}

	public void setO_reciever_number(String o_reciever_number) {
		this.o_reciever_number = o_reciever_number;
	}

}

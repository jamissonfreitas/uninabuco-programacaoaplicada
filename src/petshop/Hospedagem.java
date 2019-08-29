package petshop;

import java.util.Date;

public class Hospedagem extends Servico {
	
	public Hospedagem(double preco) {
		super(preco);
	}
	
	private Date checkin;
	private Date checkout;
	
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
}

package pl.j2dev.pojo;

import java.math.BigDecimal;

public class Account {

    private int id;
    private String accountName;
    private String description;
    private BigDecimal balance;
    
    public Account() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountName=" + accountName + ", description=" + description + ", balance="
				+ balance + "]";
	}
	
}
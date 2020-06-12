package com.webapp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity(name = "good")
public class Good {
    
	@Id
    private String id;
    
    private String name;
    private int quantity;
    private int price;
    
    @OneToMany(mappedBy="good",fetch = FetchType.LAZY)
    private List<ImportForm> importForm;
    
    @OneToMany(mappedBy="good",fetch = FetchType.LAZY)
    private List<ExportForm> exportForm;
    
    public Good() {}

	public Good(String id, String name, int quantity, int price, List<ImportForm> importForm,
			List<ExportForm> exportForm) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.importForm = importForm;
		this.exportForm = exportForm;
	}
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

	public List<ImportForm> getImportForm() {
		return importForm;
	}

	public void setImportForm(List<ImportForm> importForm) {
		this.importForm = importForm;
	}

	public List<ExportForm> getExportForm() {
		return exportForm;
	}

	public void setExportForm(List<ExportForm> exportForm) {
		this.exportForm = exportForm;
	}
	
    
}

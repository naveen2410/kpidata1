package kpidata_1.kpidata_1;

public class Customer{
	  private Long id;
	  private String name;
	  private Integer age;
	  private Address address;
	  
	  public Customer(){}
	  
	  public Customer(String name, Integer age){
	    
	    this.name = name;
	    this.age = age;
	   
	  }
	 
	  public Long getId() {
	    return id;
	  }
	 
	  public void setId(Long id) {
	    this.id = id;
	  }
	  
	  public String getName() {
	    return name;
	  }
	 
	  public void setName(String name) {
	    this.name = name;
	  }
	 
	  public Integer getAge() {
	    return age;
	  }
	 
	  public void setAge(Integer age) {
	    this.age = age;
	  }
	 
	  public Address getAddress() {
	    return address;
	  }
	 
	  public void setAddress(Address address) {
	    this.address = address;
	  }
	 
	  @Override
	  public String toString() {
	    return "Customer {name:" + name + ", age:" + age + ", address:" + address + "}";
	  }
	 
	}

package pro.cus;

public class CustomerList {
	// 用来保存客户对象的数组
	Customer[] customers;
	// 记录已保存客户对象的数量
	int total = 0;

	// 用来初始化customers数组
	public CustomerList(int totalCustomer) {
		this.customers = new Customer[totalCustomer];
	}

	/**
	 * 
	 * @Description 将参数customer添加到数组中最后一个客户对象记录之后
	 * @author niuTingTing
	 * @date 2020年4月16日上午9:18:36
	 * @param customer 指定要添加的客户对象
	 * @return 添加成功返回true；false表示数组已满，无法添加
	 */
	public boolean addCustomer(Customer customer) {
		if (total > customers.length) {
			return false;
		}
		customers[total++] = customer;
		return true;
	}

	/**
	 * @Description用途：用参数customer替换数组中由index指定的对象
	 * @author niuTingTing
	 * @date 2020年4月16日上午9:26:06
	 * @param index 指定所替换对象在数组中的位置，从0开始
	 * @param cust  指定替换的新客户对象
	 * @return 替换成功返回true；false表示索引无效，无法替换
	 * 
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if (index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	}

	/**
	 * 
	 * @Description用途：从数组中删除参数index指定索引位置的客户对象记录
	 * @author niuTingTing
	 * @date 2020年4月16日上午9:41:18
	 * @param index 指定所删除对象在数组中的索引位置，从0开始
	 * @return 删除成功返回true；false表示索引无效，无法删除
	 */
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total) {
			return false;
		}
		for (int i = index; i < total; i++) {
			customers[i] = customers[i + 1];
		}
		customers[--total] = null;
		return true;
	}

	/**
	 * @Description用途：返回数组中记录的所有客户对象
	 * @author niuTingTing
	 * @date 2020年4月16日上午9:36:36
	 * @return Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。
	 */
	public Customer[] getAllCustomers() {
		Customer[] custs = new Customer[total];
		for (int i = 0; i < total; i++)
			custs[i] = customers[i];
		return custs;
	}

	/**
	 * @Description 返回参数index指定索引位置的客户对象记录
	 * @author niuTingTing
	 * @date 2020年4月16日上午9:36:49
	 * @param index指定所要获取的客户在数组中的索引位置，从0开始
	 * @return 封装了客户信息的Customer对象
	 */
	public Customer getCustomer(int index) {
		if (index < 0 || index >= total) {
			return null;
		}
		return customers[index];

	}

	/**
	 * @Description 返回已存在的客户数量
	 * @author niuTingTing
	 * @date 2020年4月16日上午9:36:57
	 * @return 客户数量
	 */
	public int getTotal() {
		return total;
	}

	public static void main(String[] args) {
		CustomerList l1=new CustomerList(5);
		Customer a1=new Customer("niutt", '女', 12, "123456789", "1234.qq.com");
		l1.addCustomer(a1);
//		System.out.println(l1.deleteCustomer(0));
		System.out.println(l1.replaceCustomer(-1,a1));
		System.out.println(l1.deleteCustomer(0));
//		
	};
}

package com.cjn.prototype.demo1;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午2:49:26
*@remark 
*
**/
public class ConcretePrototype extends Prototype implements Cloneable{

	public ConcretePrototype(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <p>
	 * 创建一个新对象，然后将当前对象的非静态字段复制到该新对象。
	 * 如果字段是值类型的，则对该字段执行逐位复制。
	 * 如果字段是引用类型，则复制引用但不复制用用的队形;
	 * 因此，原始对象及其副本引用同一对象
	 * <p>
	 * 在《大话设计模式》中使用的是c#语言，在此处使用的是 this.memberwiseclone方法来实现浅拷贝* 
	 * <p>
	 * 经过百度java，个人认为这里是要 implements Cloneable 接口的，不然this.clone这个方法无法使用。
	 * */
	@Override
	public Prototype cloneInfo() {
		// TODO Auto-generated method stub
		try {
			return (Prototype) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	

}

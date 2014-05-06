public class HelloWorldBean {

    private final String name;

	public HelloWorldBean() {
        name = null;
	}

    public HelloWorldBean(String name) {
        this.name = name;
	}

	/**
	 * Format Hello message.
	 */
	public String sayHello() {
        if(name != null) {
            return "Hello " + name + "!";
        }
		return "Hello World!"; 
	} 
}

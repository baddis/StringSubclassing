

public class Main {

    static class Acr {
        private String value;
        public Acr(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }

    static class Foo {
        public String a(Acr val) {
            return val.toString();
        }
        public Acr b( String val) {
            return new Acr(val);
        }
    }

    public static void main(String[] args) {
        Acr a = new Acr("asdflaksdjflaskdjf");
        String s = new String("asdfasdflkjh");
	    new Foo().a(a);
        new Foo().b(s);
        new Foo().b(a);
    }

    public void foo(String x) {
        int i = x.length();
    }
}

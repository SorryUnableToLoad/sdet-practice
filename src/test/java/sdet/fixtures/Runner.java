package sdet.fixtures;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import sdet.fixtures.pojo.Address;
import sdet.fixtures.pojo.Employee;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
       /* Employee employee = new Employee(11, "suraj", true, new Address("1st street", "delhi"), Arrays.asList("manager"));
        System.out.println(employee);*/
        Fixture.of(Address.class).addTemplate("aValid", new Rule() {{
            add("street", random("street1", "street3"));
            add("city", random("city1", "city3"));
        }});
        Address validAddress = Fixture.from(Address.class).gimme("aValid");
        Fixture.of(Employee.class).addTemplate("valid", new Rule() {{
            add("id", random(Integer.class, range(101, 999)));
            add("fname", random("suraj", "Sukumar", "Sudarshan", "Mahesh"));
            add("isFTE", random(true, false));
            add("roles", uniqueRandom(Arrays.asList("tester"), Arrays.asList("QA")));
            //add("address", random(new Address("2nd street", "mangalore")));
            add("address", validAddress);
        }});

        Employee valid = Fixture.from(Employee.class).gimme("valid");
        System.out.println(valid);
        System.out.println("************************************************************************");
        List<Object> valid1 = Fixture.from(Employee.class).gimme(6, "valid");
        //valid1.forEach(System.out::println);

    }
}

import java.util.*;


public class WeekfourHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Jenny");
		employeeNames.add("Jin");
		employeeNames.add("Peter");
		employeeNames.add("Rumble");
		employeeNames.add("Lulu");
	
		
		HashSet<Integer> ids = new HashSet<Integer>();
		ids.add(0);
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(20);
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0;
		
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		};
		
		for (Integer key : employeeMap.keySet()) {
		System.out.println(key + " " + employeeMap.get(key));
		};
		
		StringBuilder idsBuilder = new StringBuilder ();
		
		for(Integer id : ids) {
			idsBuilder.append(id + "-");
		}
		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		
		for(String employeeName : employeeNames) {
			namesBuilder.append(employeeName + " ");
		}
		System.out.println(namesBuilder.toString());

	}
}

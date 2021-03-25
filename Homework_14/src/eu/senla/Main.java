package eu.senla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {

        
   Collection<String> collection = Arrays.asList("Duron_1","Celeron_7","Duron_3","Athlon_4","Athlon_5","Celeron_6","Celeron_7","Pentium_8","Pentium_9","Pentium_10");
   Stream<String> streamFromCollection = collection.stream();
   System.out.println(streamFromCollection);
   
 
		
		System.out.println(collection.stream().filter("Celeron_7"::equals).count());	
		System.out.println(collection.stream().findFirst().orElse("0"));
		System.out.println(collection.stream().skip(0));
		System.out.println("FILTR: " + collection.stream().filter("Pentium_8"::equals).findFirst().get());
		System.out.println(collection.stream().skip(4).findFirst().get());
		System.out.println(collection.stream().skip(3).limit(4).toArray());
		System.out.println(collection.stream().filter((s) -> s.contains("Ce")).collect(Collectors.toList()));
        System.out.println("last = " + collection.stream().skip(collection.size() - 1).findAny().orElse("1"));
            List<String> limit = collection.stream().limit(5).collect(Collectors.toList());
        System.out.println("limit = " + limit);
		
		
		
		
		 Collection<Processor> processor = Arrays.asList( new Processor("Duron_1", 1500),
										                new Processor("Duron_2", 1800),
										                new Processor("Duron_3", 1900),
										                new Processor("Athlon_4", 2000),
										                new Processor("Athlon_5", 2200),
										                new Processor("Celeron_6", 2500),
										                new Processor("Celeron_7", 2500),
										                new Processor("Pentium_8", 2800),
										                new Processor("Celeron_9", 3000),
										                new Processor("Pentium_10", 3400));
		
	
		 List<Processor> frequence = processor.stream().filter((p)-> p.getFreq() >= 2000 && p.getFreq() <= 3000).collect(Collectors.toList());
	        System.out.println("frequence = " + frequence + "Hz");
                        
	        double average = processor.stream().mapToInt(Processor::getFreq).average().getAsDouble();
	        System.out.println("average = " + average + "Hz");
	
	
		 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		 
//		 int i = 0;
//		 List<String> name = Arrays.asList("Duron_1","Duron_2","Duron_3","Athlon_4","Athlon_5","Celeron_6","Celeron_7","Pentium_8","Pentium_9","Pentium_10");
//			List<Integer> freq = Arrays.asList(1500, 1800, 1900, 2000, 2200, 2500, 2800, 3000, 3200, 3400);
//			List<Object> processor = new ArrayList<>();
//			
//			Processor processor1 = new Processor(name.get(i), freq.get(i));
//			
//			for(i = 0; i < 10; i++) {
//				processor.add(new Processor(name.get(i), freq.get(i)));
//			}
//			
//			System.out.println(processor);
//			
//		    Stream<Object> streamFromProcessor = processor.stream();
//		    System.out.println(streamFromProcessor);
	}

	 
	}



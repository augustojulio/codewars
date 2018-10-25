public class DnaStrand {
  public static String makeComplement(String dna) {
    //Your code
     StringBuilder reverse = new StringBuilder();

             for(int i=0;i<dna.length();i++){
                  
                  if(dna.charAt(i) == 'T'){
                      reverse.append('A');
                  }
                  if(dna.charAt(i) == 'A'){
                      reverse.append('T');
                  }
                  if(dna.charAt(i) == 'C'){
                      reverse.append('G');
                  }
                  if(dna.charAt(i) == 'G'){
                      reverse.append('C');
                  }   
             }
             System.out.println(reverse);
             return reverse.toString();
  }
}
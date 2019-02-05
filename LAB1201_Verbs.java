import java.util.*;

class LAB1201_Verbs {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the verb of choice: ");
    String verb = sc.next();
    
    
    if (! checkSimple(verb.toLowerCase()).equals("")) {
      System.out.println(checkSimple(verb.toLowerCase()));  
      getMeaning(verb.toLowerCase());
    } else if (! checkBer(verb.toLowerCase()).equals("")) {
      String result = checkBer(verb.toLowerCase());
      System.out.println(result);  
      getMeaning(result);
    } else if (! checkMe(verb.toLowerCase()).equals("")) {
      String result = checkMe(verb.toLowerCase());
      System.out.println(result); 
      getMeaning(result);
    } else {
      System.out.println("Not Found");  
    }
    
  }
  
  //Return the dictionary value of any verb
  public static void getMeaning(String verb) {
    Dictionary<String,String> dict = new Hashtable<String,String>();
    dict.put("ada", "there is OR to have");
    dict.put("bangun", "to wake up");
    dict.put("datang", "to come to/from");
    dict.put("duduk", "to sit (on)");
    dict.put("gagal", "to fail");
    dict.put("hidup", "to live (at)");
    dict.put("ingat", "to remember");
    dict.put("ingin", "to wish");
    dict.put("ikut", "to join (in)");
    dict.put("jatuh", "to fall (into)");
    dict.put("keluar", "to go out (of)");
    dict.put("kembali", "to return to");
    dict.put("lahir", "to be born (at)");
    dict.put("lepas", "to escape (from)");
    dict.put("lewat", "to pass(by)");
    dict.put("lulus", "to pass (exam) || to graduate");
    dict.put("lupa", "to forget");
    dict.put("maju","to go forward");
    dict.put("mampir","to drop (by,at)");
    dict.put("mandi","to shower");
    dict.put("masuk","to enter");
    dict.put("mundur","to retreat");
    dict.put("naik","to ride || to go up || to board on");
    dict.put("pergi","to go");
    dict.put("pindah","to move (in,out)");
    dict.put("pulang","to go home");
    dict.put("sampai","to reach");
    dict.put("selesai","to finish");
    dict.put("sembuh","to recover (from)");
    dict.put("suka","to like");
    dict.put("tahu","to know (about)");
    dict.put("tamat","to graduate");
    dict.put("terbang","to fly");
    dict.put("terbenam","to set");
    dict.put("terbit","to rise");
    dict.put("tiba","to arrive (at,on)");
    dict.put("tidur","to sleep");
    dict.put("tinggal","to stay || to live (at,in)");
    dict.put("tumbuh","to grow");
    dict.put("turun","to go down || to alight");
    
    dict.put("berangkat","to leave for");
    dict.put("berjalanan","to walk");
    dict.put("bergerak","to move");
    dict.put("berkumpul","to assemble");
    dict.put("berkunjung","to pay a visit");
    dict.put("bekerja","to work");
    dict.put("berkelahi","to fight");
    dict.put("bermain","to play");
    dict.put("belajar","to study");
    dict.put("berlari","to run");
    dict.put("berhenti","to stop");
    dict.put("berdiri","to stand");
    dict.put("bertanya","to query");
    dict.put("berbicara","to speak/to talk");
    dict.put("bercakap","to converse");
    dict.put("berenang","to swim");
    dict.put("berpikir","to think");
    dict.put("bertemu","to meet with");
    dict.put("berbelanja","to shop");
    dict.put("bercakap-cakap", "to chit-chat");
    
    dict.put("menawar","to bargain");
    dict.put("memberi","to give");
    dict.put("membeli","to buy");
    dict.put("mencoba","to try");
    dict.put("melihat","to see");
    dict.put("menjual","to sell");
    dict.put("membuat","to make");
    dict.put("menyanyi","to sing");
    dict.put("menikah","to get married");
    dict.put("merokok","to smoke");
    dict.put("membaca","to read");
    dict.put("mendengar","to hear");
    dict.put("mencari","to look for || to seek || to hunt");
    dict.put("mengantar","to deliver");
    dict.put("mengisi","to fill up");
    dict.put("mengundung","to invite");
    dict.put("mengeja","to spell");
    dict.put("mengobrol","to chat");
    dict.put("mengganggu","to disturb");
    dict.put("menghukum","to punish someone");
    dict.put("menelepon","to call someone");
    dict.put("membawa","to carry");
    dict.put("menunggu","to wait");
    dict.put("mengirim","to send");
    dict.put("menari","to dance");
    dict.put("menyewa","to rent");
    dict.put("memesan","to order");
    dict.put("memakai","to wear");
    dict.put("menonton","to watch");
    dict.put("mengajar","to teach");
    dict.put("mengantar","to bring something || accompany someone to a place");
    dict.put("menggambar","to draw");
    dict.put("membuka","to open");
    dict.put("memberikan","to give");
    dict.put("menangis", "to cry");
    dict.put("menginap", "to sleep over");
    
    System.out.println(dict.get(verb));
  }
  
  //Check whether verb entered is a simple verb --> Return simple verb if it is or an empty string otherwise
  public static String checkSimple(String verb) {
    boolean found = false;
    String result = "";
    String[] simpleVerbList = { "ada", "bangun", "datang", "duduk", "gagal", "hidup", 
                                "ingat", "ingin", "ikut", "jatuh", "keluar", "kembali", 
                                "lahir", "lepas", "lewat", "lulus", "lupa", "maju",
                                "mampir", "mandi", "masuk", "mundur", "naik", "pergi",
                                "pindah" , "pulang", "sampai", "selesai", "sembuh", "suka",
                                "tahu", "tamat", "terbang", "terbenam","terbit", "tiba", "tidur", "tinggal",
                                "tumbuh", "turun" };
    
    for (int i = 0; i < simpleVerbList.length ; i++) {
      if (simpleVerbList[i].equals(verb))  {
        result = verb;
        found = true;  
      }
    }
    
    if (found == true) {

      
      if (verb.equals("gagal") || verb.equals("lulus")) {
        result += " (dalam)";
        return result;
      }
      
      if (verb.equals("ingat")) {
        result += " (pada)"; 
        return result;
      }
      
      if (verb.equals("ikut")) {
        result += " (dengan)";
        return result;
      }
      
      if (verb.equals("tahu")) {
        result += " (tentang)";
        return result;
      }
      
      if (verb.equals("tiba")) {
        result += " (di/pada)";
        return result;
      }
      if (verb.equals("mampir")) {
        result += " (di/ke)";
        return result;
      }
      String[] diList = {"duduk", "hidup", "lahir", "lewat",  "tinggal"};
      for (int i = 0; i < diList.length; i++) {
        if (diList[i].equals(verb)) {
          result += " (di)";
          return result;
        }
      }
      
      
      String[] keList = {"jatuh", "kembali", "maju", "naik", "masuk"};
      for (int i = 0; i < keList.length; i++) {
        if (keList[i].equals(verb)) {
          result += " (ke)";
          return result;
        }
      }
      
      String[] dariList = {"keluar", "lepas", "sembuh", "turun"};
      for (int i = 0; i < dariList.length; i++) {
        if (dariList[i].equals(verb)) {
          result += " (dari)";
          return result;
        }
      }

    } else {
      return ""; //return empty string if cannot find  
    }
    return result;
  }
  
  public static String checkBer(String verb) {
    boolean found = false;
    String result = "";
    String[] berVerbList = {"angkat", "jalan", "gerak", "kumpul", "kunjung", 
                            "kerja","kelahi", "main", "ajar", "lari", "henti",
                            "diri", "tanya", "bicara", "cakap","cakap-cakap" , "renang", "pikir",
                            "temu"};
    
    for (int i = 0; i < berVerbList.length ; i++) {
      if (berVerbList[i].equals(verb))  {
        if (verb.equals("kerja")) {
          result = "bekerja";
        } else if (verb.equals("ajar")) {
          result = "belajar";
        } else {
          result = "ber" + verb;
        }
        found = true;  
      }
    }
  
    return result;
   
    
  }
  
  public static String checkMe(String verb) {
    //me: l, m, n, ny, r (lmn, ny, r)
    //mem: b, p  (membawa, memesan) (bukit panjang)
    //men: c, d, j, t (menawar, mencoba, mendengar, menjadi) (c the dj talking)
    //meng: a, e, i, o, u, g, h, k (mengirim, mengambil) (aeiou go hong kong)
    //meny: s (menyewa) 
    
    String result = "";
    if (verb.charAt(0) == 'm' || verb.charAt(0) == 'n' || verb.substring(0,2).equals("ny") 
       || verb.charAt(0) == 'r' || verb.charAt(0) == 'l') { //l, m, n, ny, r
      result = "me" + verb;
    } else if (verb.charAt(0) == 'b') { // b
      result = "mem" + verb;  
    } else if (verb.charAt(0) == 'd' || verb.charAt(0) == 'j' || verb.charAt(0) == 'c') { //c, d, j
      result = "men" + verb;  
    } else if (verb.charAt(0) == 'a' || verb.charAt(0) == 'e' || verb.charAt(0) == 'i' || verb.charAt(0) == 'o'
                 || verb.charAt(0) == 'u' || verb.charAt(0) == 'g' || verb.charAt(0) == 'h') { // a, e, i, o, u, g, h
      result = "meng" + verb;  
    } else if (verb.charAt(0) == 'p') {
      result = "mem" + verb.substring(1);  
    } else if (verb.charAt(0) == 't') {
      result = "men" + verb.substring(1);  
    } else if (verb.charAt(0) == 'k') {
      result = "meng" + verb.substring(1);  
    } else if (verb.charAt(0) == 's') {
      result = "meny" + verb.substring(1);  
    }
    return result;
  }
  
}
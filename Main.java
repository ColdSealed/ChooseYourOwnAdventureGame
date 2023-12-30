import java.util.*;
public class Main {
            public static void main(String[] args) {
              while (true) {
                  Scanner console = new Scanner(System.in);
                  boolean hasFingerprints = false;
                  System.out.println("Enter the name of the detective you will play as.");
                  String detectiveName = console.next();
                  System.out.println("You are playing as " + detectiveName + ", a famous detective known for their quickness in solving cases.");
                  System.out.println("You recieve a call from the police chief while your on vacation in Maldives.");
                  System.out.println("He asks whether you want to investigate a murder case in Cancun, Mexico.");
                  System.out.println("What would you like to do?");
                  System.out.println("1: Yes, I would like to investigate the case!");
                  System.out.println("2: No, I would rather stay on vacation.");
                  int investigateOrNo = console.nextInt();
                  if (investigateOrNo == 2) {
                      System.out.println("Police Chief: " + detectiveName + ", you must investigate this case!");
                  }
                  System.out.println("While on the way to the murder scene, you feel hungry. Do you want to eat something?");
                  System.out.println("1. Yes, I would like to eat something.");
                  System.out.println("2. No, I want to get to the hotel.");
                  int hungryOrNo = console.nextInt();
                  if (hungryOrNo == 1) {
                      System.out.println("What would you like to eat?");
                      System.out.println("1. Egg McMuffin.");
                      System.out.println("2. Sausage McMuffin.");
                      System.out.println("3. Hash Brown.");
                      int foodOption = console.nextInt();
                      if (foodOption == 1 || foodOption == 2 || foodOption == 3) {
                          System.out.println("You ate your breakfast. It tasted very good.");
                      }
                  }
                  System.out.println("You arrive at the hotel in Cancun, Mexico where the murder happened.");
                  System.out.println("What would you like to do?");
                  System.out.println("1: Look around the hotel area.");
                  System.out.println("2: Go to the murder scene.");
                  System.out.println("3: Talk to witnesses.");
                  int firstOption = console.nextInt();//Look around the hotel area
                  if (firstOption == 1) {
                      System.out.println("You go to the back of the hotel and see nothing of interest except for a dumpster.");
                      System.out.println("What do you want to do?");
                      System.out.println("1: Look inside the dumpster.");
                      System.out.println("2: Move on.");
                      int lookInsideDumpster = console.nextInt();
                      if (lookInsideDumpster == 1) {
                          System.out.println("You look inside the dumpster and notice some rope.");
                          System.out.println("Do you want to use gloves to pick it up?");
                          System.out.println("1. Yes.");
                          System.out.println("2. No.");
                          int useGloves = console.nextInt();
                          if (useGloves == 1) {
                              System.out.println("After examination, you find that the rope contains fingerprints. It will be useful in your investigation.");
                              hasFingerprints = true;
                          } else {
                              System.out.println("After examination, you find that the rope has been contaimanted as your fingerprints are also on it due to not picking it up with gloves.");
                          }
                      }
                      System.out.println("It becomes quite dark outside. Would you like to stay outside longer to search for evidence?");
                      System.out.println("1. Yes.");
                      System.out.println("2. No.");
                      int stayOutside = console.nextInt();
                      if (stayOutside == 1) {
                          System.out.println("You decide to stay around longer to search for evidence. Unfortunately, while you weren't looking, someone stabbed you in the heart with a knife, killing you.");
                          System.out.println("BAD ENDING #1");
                          break;
                      }
                  } else if (firstOption == 2) { //Go to the murder scene
                      System.out.println("You go to the murder scene and find a body laying on the floor with blood coming from the chest.");
                      System.out.println("What do you want to do?");
                      System.out.println("1. Examine the body.");
                      System.out.println("2. Examine the surrounding area and look for clues.");
                      int bodyOrArea = console.nextInt();
                      if (bodyOrArea == 1) {
                          System.out.println("You examine the body and find stab marks on his chest. You also find rope mark on his wrist. Looking in his pocket, you find an ID.");
                          System.out.println("The ID reads, Bincan Moongold, 26 years old, Male, employed as a journalist.");
                          System.out.println("The face on the ID seems to match the body.");
                          System.out.println("Using the temperature of the body, you can tell that he died at around 12pm yesterday.");
                      } else {
                          System.out.println("While examining the surrounding area, you find a knife.");
                          System.out.println("What do you want to do?");
                          System.out.println("1. Pick the knife up with gloves.");
                          System.out.println("2. Pick the knife up without gloves.");
                          int knifeGloves = console.nextInt();
                          if (knifeGloves == 1) {
                              System.out.println("There are no finger prints on the knife!");
                          } else {
                              System.out.println("The knife is contaminated with your fingerprints! Find more evidence.");
                          }
                      }
                      if (bodyOrArea == 1) {
                          System.out.println("Would you like to examine the surrounding area to look for clues?");
                          System.out.println("1. Yes");
                          System.out.println("2. No");
                          int examineSurrounding = console.nextInt();
                          if (examineSurrounding == 1) {
                              System.out.println("While examining the surrounding area, you find a knife.");
                              System.out.println("What do you want to do?");
                              System.out.println("1. Pick the knife up with gloves.");
                              System.out.println("2. Pick the knife up without gloves.");
                              int knifeGloves = console.nextInt();
                              if (knifeGloves == 1) {
                                  System.out.println("There are no finger prints on the knife!");
                              } else {
                                  System.out.println("The knife is contaminated with your fingerprints! Find more evidence.");
                              }
                          } else {
                              System.out.println("Would you like to examine the body?");
                              System.out.println("1. Yes");
                              System.out.println("2. No");
                              int examineBody = console.nextInt();
                              if (examineBody == 1) {
                                  System.out.println("You examine the body and find stab marks on his chest. You also find rope mark on his wrist. Looking in his pocket, you find an ID.");
                                  System.out.println("The ID reads, Bincan Moongold, 26 years old, Male, employed as a journalist.");
                                  System.out.println("The face on the ID seems to match the body.");
                                  System.out.println("From the temperature of the body, you can tell it happened at about 12pm yesterday.");
                              }
                          }
                      }
                  } else {//Talk to witnesses
                      Witness(detectiveName);
                  }
                  if (firstOption == 1) {
                      System.out.println("What would you like to do next?");
                      System.out.println("1. Examine the murder scene.");
                      System.out.println("2. Talk to witnesses.");
                      int secondOption = console.nextInt();
                      if (secondOption == 1) {
                          System.out.println("You go to the murder scene and find a body laying on the floor with blood coming from the chest.");
                          System.out.println("What do you want to do?");
                          System.out.println("1. Examine the body.");
                          System.out.println("2. Examine the surrounding area and look for clues.");
                          int bodyOrArea = console.nextInt();
                          if (bodyOrArea == 1) {
                              System.out.println("You examine the body and find stab marks on his chest. You also find rope mark on his wrist. Looking in his pocket, you find an ID.");
                              System.out.println("The ID reads, Bincan Moongold, 26 years old, Male, employed as a journalist.");
                              System.out.println("The face on the ID seems to match the body.");
                              System.out.println("Using the temperature of the body, you can tell that he died at around 12pm yesterday.");
                          } else {
                              System.out.println("While examining the surrounding area, you find a knife.");
                              System.out.println("What do you want to do?");
                              System.out.println("1. Pick the knife up with gloves.");
                              System.out.println("2. Pick the knife up without gloves.");
                              int knifeGloves = console.nextInt();
                              if (knifeGloves == 1) {
                                  System.out.println("There are no finger prints on the knife!");
                              } else {
                                  System.out.println("The knife is contaminated with your fingerprints! Find more evidence. ");
                              }
                          }  
                          if (bodyOrArea == 1) {
                              System.out.println("Would you like to examine the surrounding area to look for clues?");
                              System.out.println("1. Yes");
                              System.out.println("2. No");
                              int examineSurrounding = console.nextInt();
                              if (examineSurrounding == 1) {
                                  System.out.println("While examining the surrounding area, you find a knife.");
                                  System.out.println("What do you want to do?");
                                  System.out.println("1. Pick the knife up with gloves.");
                                  System.out.println("2. Pick the knife up without gloves.");
                                  int knifeGloves = console.nextInt();
                                  if (knifeGloves == 1) {
                                      System.out.println("There are no finger prints on the knife!");
                                  } else {
                                      System.out.println("The knife is contaminated with your fingerprints! Find more evidence. ");
                                  }
                              } else {
                                  System.out.println("Would you like to examine the body?");
                                  System.out.println("1. Yes");
                                  System.out.println("2. No");
                                  int examineBody = console.nextInt();
                                  if (examineBody == 1) {
                                      System.out.println("You examine the body and find stab marks on his chest. You also find rope mark on his wrist. Looking in his pocket, you find an ID.");
                                      System.out.println("The ID reads, Bincan Moongold, 26 years old, Male, employed as a journalist.");
                                      System.out.println("The face on the ID seems to match the body.");
                                      System.out.println("From the temperature of the body, you can tell it happened at about 12pm yesterday.");
                                  }
                              }
                          }
                      } else {
                          Witness(detectiveName);
                      }
                      if (secondOption == 1) {
                          System.out.println("Would you like to interrogate the witnesses?");
                          System.out.println("1. Yes, I would like to talk to the witnesses.");
                          System.out.println("2. No, I want to arrest the murderer.");
                          int witnessOrAccuse = console.nextInt();
                          if (witnessOrAccuse == 1) {
                              Witness(detectiveName);
                          }
                      } else {
                          System.out.println("Would you like to examine the murder scene?");
                          System.out.println("1. Yes, I would like to examine the murder scene.");
                          System.out.println("2. No, I want to arrest the murderer.");
                          int examineOrAccuse = console.nextInt();
                          if (examineOrAccuse == 1) {
                              System.out.println("You go to the murder scene and find a body laying on the floor with blood coming from the chest.");
                              System.out.println("What do you want to do?");
                              System.out.println("1. Examine the body.");
                              System.out.println("2. Examine the surrounding area and look for clues.");
                              int bodyOrArea = console.nextInt();
                              if (bodyOrArea == 1) {
                                  System.out.println("You examine the body and find stab marks on his chest. You also find rope mark on his wrist. Looking in his pocket, you find an ID.");
                                  System.out.println("The ID reads, Bincan Moongold, 26 years old, Male, employed as a journalist.");
                                  System.out.println("The face on the ID seems to match the body.");
                                  System.out.println("Using the temperature of the body, you can tell that he died at around 12pm yesterday.");
                              } else {
                                  System.out.println("While examining the surrounding area, you find a knife.");
                                  System.out.println("What do you want to do?");
                                  System.out.println("1. Pick the knife up with gloves.");
                                  System.out.println("2. Pick the knife up without gloves.");
                                  int knifeGloves = console.nextInt();
                                  if (knifeGloves == 1) {
                                      System.out.println("There are no finger prints on the knife!");
                                  } else {
                                      System.out.println("The knife is contaminated with your fingerprints! Find more evidence. ");
                                  }
                              }
                              if (bodyOrArea == 1) {
                                  System.out.println("Would you like to examine the surrounding area to look for clues?");
                                  System.out.println("1. Yes");
                                  System.out.println("2. No");
                                  int examineSurrounding = console.nextInt();
                                  if (examineSurrounding == 1) {
                                      System.out.println("While examining the surrounding area, you find a knife.");
                                      System.out.println("What do you want to do?");
                                      System.out.println("1. Pick the knife up with gloves.");
                                      System.out.println("2. Pick the knife up without gloves.");
                                      int knifeGloves = console.nextInt();
                                      if (knifeGloves == 1) {
                                          System.out.println("There are no finger prints on the knife!");
                                      } else {
                                          System.out.println("The knife is contaminated with your fingerprints! Find more evidence. ");
                                      }
                                  } else {
                                      System.out.println("Would you like to examine the body?");
                                      System.out.println("1. Yes");
                                      System.out.println("2. No");
                                      int examineBody = console.nextInt();
                                      if (examineBody == 1){
                                          System.out.println("You examine the body and find stab marks on his chest. You also find rope mark on his wrist. Looking in his pocket, you find an ID.");
                                          System.out.println("The ID reads, Bincan Moongold, 26 years old, Male, employed as a journalist.");
                                          System.out.println("The face on the ID seems to match the body.");
                                          System.out.println("From the temperature of the body, you can tell it happened at about around 12pm yesterday.");
                                      }
                                  }
                              }
                          }
                      }
                  } else if (firstOption == 2) {
                      System.out.println("What would you like to do next?");
                      System.out.println("1. Look around the hotel area.");
                      System.out.println("2. Talk to witnesses");
                      int secondOption = console.nextInt();
                      if (secondOption == 1) {
                          System.out.println("You go to the back of the hotel and see nothing of interest except for a dumpster.");
                          System.out.println("What do you want to do?");
                          System.out.println("1: Look inside the dumpster.");
                          System.out.println("2: Move on.");
                          int lookInsideDumpster = console.nextInt();
                          if (lookInsideDumpster == 1) {
                              System.out.println("You look inside the dumpster and notice some rope.");
                              System.out.println("Do you want to use gloves to pick it up?");
                              System.out.println("1. Yes.");
                              System.out.println("2. No.");
                              int useGloves = console.nextInt();
                              if (useGloves == 1) {
                                  System.out.println("After examination, you find that the rope contains fingerprints. It will be useful in your investigation.");
                                  hasFingerprints = true;
                              } else {
                                  System.out.println("After examination, you find that the rope has been contaimanted as your fingerprints are also on it due to not picking it up with gloves.");
                              }
                          }
                          System.out.println("It becomes quite dark outside. Would you like to stay outside longer to search for evidence?");
                          System.out.println("1. Yes.");
                          System.out.println("2. No.");
                          int stayOutside = console.nextInt();
                          if (stayOutside == 1) {
                              System.out.println("You decide to stay around longer to search for evidence. Unfortunately, while you weren't looking, someone stabbed you in the heart with a knife, killing you.");
                              System.out.println("BAD ENDING #1");
                              break;
                          }
                      } else {
                          Witness(detectiveName);
                      }
                      if (secondOption == 1) {
                          System.out.println("Would you like to talk to the witnesses?");
                          System.out.println("1. Yes, I would like to talk to the witnesses.");
                          System.out.println("2. No, I would like to arrest the murderer.");
                          int witnessOrAccuse = console.nextInt();
                          if (witnessOrAccuse == 1){
                              Witness(detectiveName);
                          }
                      } else {
                          System.out.println("Would you like to look around the hotel area?");
                          System.out.println("1. Yes, I would like to look around the hotel area.");
                          System.out.println("2. No, I would like to arrest the murderer.");
                          int hotelAreaOrAccuse = console.nextInt();
                          if (hotelAreaOrAccuse == 1) {
                              System.out.println("You go to the back of the hotel and see nothing of interest except for a dumpster.");
                              System.out.println("What do you want to do?");
                              System.out.println("1: Look inside the dumpster.");
                              System.out.println("2: Move on.");
                              int lookInsideDumpster = console.nextInt();
                              if (lookInsideDumpster == 1) {
                                  System.out.println("You look inside the dumpster and notice some rope.");
                                  System.out.println("Do you want to use gloves to pick it up?");
                                  System.out.println("1. Yes.");
                                  System.out.println("2. No.");
                                  int useGloves = console.nextInt();
                                  if (useGloves == 1) {
                                      System.out.println("After examination, you find that the rope contains fingerprints. It will be useful in your investigation.");
                                      hasFingerprints = true;
                                  } else {
                                      System.out.println("After examination, you find that the rope has been contaimanted as your fingerprints are also on it due to not picking it up with gloves.");
                                  }
                              }
                              System.out.println("It becomes quite dark outside. Would you like to stay outside longer to search for evidence?");
                              System.out.println("1. Yes.");
                              System.out.println("2. No.");
                              int stayOutside = console.nextInt();
                              if (stayOutside == 1) {
                                  System.out.println("You decide to stay around longer to search for evidence. Unfortunately, while you weren't looking, someone stabbed you in the heart with a knife, killing you.");
                                  System.out.println("BAD ENDING #1");
                                  break;
                              }
                          }  
                      }   
                  } else {
                      System.out.println("What would you like to do next?");
                      System.out.println("1. Look around the hotel area.");
                      System.out.println("2. Go to the the murder scene.");
                      int secondOption = console.nextInt();
                      if (secondOption == 1) {
                          System.out.println("You go to the back of the hotel and see nothing of interest except for a dumpster.");
                          System.out.println("What do you want to do?");
                          System.out.println("1: Look inside the dumpster.");
                          System.out.println("2: Move on.");
                          int lookInsideDumpster = console.nextInt();
                          if (lookInsideDumpster == 1) {
                              System.out.println("You look inside the dumpster and notice some rope.");
                              System.out.println("Do you want to use gloves to pick it up?");
                              System.out.println("1. Yes.");
                              System.out.println("2. No.");
                              int useGloves = console.nextInt();
                              if (useGloves == 1) {
                                  System.out.println("After examination, you find that the rope contains fingerprints. It will be useful in your investigation.");
                                  hasFingerprints = true;
                              } else {
                                  System.out.println("After examination, you find that the rope has been contaimanted as your fingerprints are also on it due to not picking it up with gloves.");
                              }
                          }
                          System.out.println("It becomes quite dark outside. Would you like to stay outside longer to search for evidence?");
                          System.out.println("1. Yes.");
                          System.out.println("2. No.");
                          int stayOutside = console.nextInt();
                          if (stayOutside == 1) {
                              System.out.println("You decide to stay around longer to search for evidence. Unfortunately, while you weren't looking, someone stabbed you in the heart with a knife, killing you.");
                              System.out.println("BAD ENDING #1");
                              break;
                          }
                      } else {
                          System.out.println("You go to the murder scene and find a body laying on the floor with blood coming from the chest.");
                          System.out.println("What do you want to do?");
                          System.out.println("1. Examine the body.");
                          System.out.println("2. Examine the surrounding area and look for clues.");
                          int bodyOrArea = console.nextInt();
                          if (bodyOrArea == 1) {
                              System.out.println("You examine the body and find stab marks on his chest. You also find rope mark on his wrist. Looking in his pocket, you find an ID.");
                              System.out.println("The ID reads, Bincan Moongold, 26 years old, Male, employed as a journalist.");
                              System.out.println("The face on the ID seems to match the body.");
                              System.out.println("Using the temperature of the body, you can tell that he died at around 12pm yesterday.");
                          } else {
                              System.out.println("While examining the surrounding area, you find a knife.");
                              System.out.println("What do you want to do?");
                              System.out.println("1. Pick the knife up with gloves.");
                              System.out.println("2. Pick the knife up without gloves.");
                              int knifeGloves = console.nextInt();
                              if (knifeGloves == 1) {
                                  System.out.println("There are no finger prints on the knife!");
                              } else {
                                  System.out.println("The knife is contaminated with your fingerprints! Find more evidence. ");
                              }
                          }
                          if (bodyOrArea == 1) {
                              System.out.println("Would you like to examine the surrounding area to look for clues?");
                              System.out.println("1. Yes");
                              System.out.println("2. No");
                              int examineSurrounding = console.nextInt();
                              if (examineSurrounding == 1) {
                                  System.out.println("While examining the surrounding area, you find a knife.");
                                  System.out.println("What do you want to do?");
                                  System.out.println("1. Pick the knife up with gloves.");
                                  System.out.println("2. Pick the knife up without gloves.");
                                  int knifeGloves = console.nextInt();
                                  if (knifeGloves == 1) {
                                      System.out.println("There are no finger prints on the knife!");
                                  } else {
                                      System.out.println("The knife is contaminated! Find more evidence. ");
                                  }
                              } else {
                                  System.out.println("Would you like to examine the body?");
                                  System.out.println("1. Yes");
                                  System.out.println("2. No");
                                  int examineBody = console.nextInt();
                                  if (examineBody == 1) {
                                      System.out.println("You examine the body and find stab marks on his chest. You also find rope mark on his wrist. Looking in his pocket, you find an ID.");
                                      System.out.println("The ID reads, Bincan Moongold, 26 years old, Male, employed as a journalist.");
                                      System.out.println("The face on the ID seems to match the body.");
                                      System.out.println("From the temperature of the body, you can tell it happened at about 12pm yesterday.");
                                  }
                              }
                          }
                      }
                      if (secondOption == 1) {
                          System.out.println("Would you like to go to the murder scene?");
                          System.out.println("1. Yes, I would like to go to the murder scene.");
                          System.out.println("2. No, I would like to arrest the murderer.");
                          int sceneOrAccuse = console.nextInt();
                          if (sceneOrAccuse == 1) {
                              System.out.println("You go to the murder scene and find a body laying on the floor with blood coming from the chest.");
                              System.out.println("What do you want to do?");
                              System.out.println("1. Examine the body.");
                              System.out.println("2. Examine the surrounding area and look for clues.");
                              int bodyOrArea = console.nextInt();
                              if (bodyOrArea == 1) {
                                  System.out.println("You examine the body and find stab marks on his chest. You also find rope mark on his wrist. Looking in his pocket, you find an ID.");
                                  System.out.println("The ID reads, Bincan Moongold, 26 years old, Male, employed as a journalist.");
                                  System.out.println("The face on the ID seems to match the body.");
                                  System.out.println("Using the temperature of the body, you can tell that he died at around 12pm yesterday.");
                              } else {
                                  System.out.println("While examining the surrounding area, you find a knife.");
                                  System.out.println("What do you want to do?");
                                  System.out.println("1. Pick the knife up with gloves.");
                                  System.out.println("2. Pick the knife up without gloves.");
                                  int knifeGloves = console.nextInt();
                                  if (knifeGloves == 1) {
                                      System.out.println("There are no finger prints on the knife!");
                                  } else {
                                      System.out.println("The knife is contaminated with your fingerprints! Find more evidence. ");
                                  }
                              }
                              if (bodyOrArea == 1) {
                                  System.out.println("Would you like to examine the surrounding area to look for clues?");
                                  System.out.println("1. Yes");
                                  System.out.println("2. No");
                                  int examineSurrounding = console.nextInt();
                                  if (examineSurrounding == 1) {
                                      System.out.println("While examining the surrounding area, you find a knife.");
                                      System.out.println("What do you want to do?");
                                      System.out.println("1. Pick the knife up with gloves.");
                                      System.out.println("2. Pick the knife up without gloves.");
                                      int knifeGloves = console.nextInt();
                                      if (knifeGloves == 1) {
                                          System.out.println("There are no finger prints on the knife!");
                                      } else {
                                          System.out.println("The knife is contaminated! Find more evidence. ");
                                      }
                                  } else {
                                      System.out.println("Would you like to examine the body?");
                                      System.out.println("1. Yes");
                                      System.out.println("2. No");
                                      int examineBody = console.nextInt();
                                      if (examineBody == 1) {
                                          System.out.println("You examine the body and find stab marks on his chest. You also find rope mark on his wrist. Looking in his pocket, you find an ID.");
                                          System.out.println("The ID reads, Bincan Moongold, 26 years old, Male, employed as a journalist.");
                                          System.out.println("The face on the ID seems to match the body.");
                                          System.out.println("From the temperature of the body, you can tell it happened at about 12pm yesterday.");
                                      }
                                  }
                              }
                          }
                      } else {
                          System.out.println("Would you like to look around the hotel area?");
                          System.out.println("1. Yes, I would like to look around the hotel area.");
                          System.out.println("2. No, I would like to arrest the murderer.");
                          int hotelAreaOrAccuse = console.nextInt();
                          if (hotelAreaOrAccuse == 1) {
                              System.out.println("You go to the back of the hotel and see nothing of interest except for a dumpster.");
                              System.out.println("What do you want to do?");
                              System.out.println("1: Look inside the dumpster.");
                              System.out.println("2: Move on.");
                              int lookInsideDumpster = console.nextInt();
                              if (lookInsideDumpster == 1) {
                                  System.out.println("You look inside the dumpster and notice some rope.");
                                  System.out.println("Do you want to use gloves to pick it up?");
                                  System.out.println("1. Yes.");
                                  System.out.println("2. No.");
                                  int useGloves = console.nextInt();
                                  if (useGloves == 1) {
                                      System.out.println("After examination, you find that the rope contains fingerprints. It will be useful in your investigation.");
                                      hasFingerprints = true;
                                  } else {
                                      System.out.println("After examination, you find that the rope has been contaimanted as your fingerprints are also on it due to not picking it up with gloves.");
                                  }
                              }
                              System.out.println("It becomes quite dark outside. Would you like to stay outside longer to search for evidence?");
                              System.out.println("1. Yes.");
                              System.out.println("2. No.");
                              int stayOutside = console.nextInt();
                              if (stayOutside == 1) {
                                  System.out.println("You decide to stay around longer to search for evidence. Unfortunately, while you weren't looking, someone stabbed you in the heart with a knife, killing you.");
                                  System.out.println("BAD ENDING #1");
                                  break;
                              }
                          }
                      }
                  }
                  if (hasFingerprints == true) {
                      System.out.println("The fingerprints results have come back. Testing it with the fingerprints of the suspects has resulted in a match with the neighbor's fingerprints.");
                  }
                  System.out.println("You gather all 4 suspects into a room. Who do you think murdered Bincan Moongold?");
                  System.out.println("1. The Maid.");
                  System.out.println("2. The Receptionist.");
                  System.out.println("3. The Janitor.");
                  System.out.println("4. The Neighbor.");
                  System.out.println("5. I'm not sure.");
                  int accusation = console.nextInt();
                  if (accusation == 1) {
                      System.out.println(detectiveName + ": I think that the maid murdered Bincan Moongold!");
                  } else if (accusation == 2) {
                      System.out.println(detectiveName + ": I think that the receptionist murdered Bincan Moongold!");
                  } else if (accusation == 3) {
                      System.out.println(detectiveName + ": I think that the janitor murdered Bincan Moongold!");
                  } else if (accusation == 4) {
                      System.out.println(detectiveName + ": I think that the neighbor murdered Bincan Moongold!");
                  } else {
                      System.out.println(detectiveName + ": I am not sure who murdered Bincan Moongold.");;
                  }
                  if (accusation != 4) {
                      if (accusation == 5) {
                          System.out.println("You are not sure who murdered Bincan Moongold. The case is closed and you are criticised for not being able to find the murderer.");
                          System.out.println("You lose your detective license.");
                          System.out.println("BAD ENDING #2");
                          break;
                      } else {
                          System.out.println("After arresting the suspect, you leave. However, after an extensive investigation by another third party, it is revealed that you arrested the wrong suspect.");
                          System.out.println("It turns out the murderer was the neighbor, Bob. However, it seems as if he has escape the country.");
                          System.out.println("You are criticised for arresting the wrong suspect and lose your detective license due to this.");
                          System.out.println("BAD ENDING #3");
                          break;
                      }
                  } else {
                      System.out.println("You arrest the neighbor and are praised for your diligence in solving the case.");
                      System.out.println("However, you have yet to figure out why he murdered Bincan.");
                      System.out.println("What would you like to do?");
                      System.out.println("1. Ask Bob why he murdered Bincan.");
                      System.out.println("2. Go get some McDonalds.");
                      int motiveOrFood = console.nextInt();
                      if (motiveOrFood == 1) {
                          System.out.println("Would you like to interrogate Bob with a fellow officer or by yourself?");
                          System.out.println("1. I would like to interrogate him with a fellow officer.");
                          System.out.println("2. I would like to interrogate him by myself.");
                          int interrogateWithOrWithout = console.nextInt();
                          if (interrogateWithOrWithout == 1) {
                              System.out.println("You go to interrogate Bob with a fellow officer.");
                              System.out.println(detectiveName + ": Why did you murderer Bincan?");
                              System.out.println("Bob: Well, one day I sat down with Bincan to eat breakfast. We were just talking when I told him that I work in a jewelry store.");
                              System.out.println("Bob: He asked me if I could appraise a diamond for him. I said I could. The next day, I went to his room and appraised the diamond.");
                              System.out.println("Bob: The diamond was of very fine quality and must have been worth thousands of dollars. I could not pass up an opportunity to steal the diamond.");
                              System.out.println("Bob: So, I did what had to be done. I murdererd him and took his diamond, which I've already sold.");
                              System.out.println("You are disgusted by Bob.");
                              System.out.println("You leave after Bob is hauled away.");
                              System.out.println("Several weeks later, you read a newspaper praising you for finding the murderer in such a short time.");
                              System.out.println("GOOD ENDING #1");
                              break;
                          } else {
                              System.out.println("You go to interrogate Bob by yourself.");
                              System.out.println(detectiveName + ": Why did you murderer Bincan?");
                              System.out.println("Bob: Well, one day I sat down with Bincan to eat breakfast. We were just talking when I told him that I work in a jewelry store.");
                              System.out.println("Bob: He asked me if I could appraise a diamond for him. I said I could. The next day, I went to his room and appraised the diamond.");
                              System.out.println("Bob: The diamond was of very fine quality and must have been worth thousands of dollars. I could not pass up an opportunity to steal the diamond.");
                              System.out.println("Bob: So, I did what had to be done. I murdererd him and took his diamond, which I've already sold.");
                              System.out.println("You are disgusted by Bob.");
                              System.out.println("As you are about to leave, Bob jumps out from his seat, and strangles you to death.");
                              System.out.println("BAD ENDING #4");
                              break;
                          }
                      } else {
                          System.out.println("You go and get some McDonalds and decide it is not worth your time to ask why he murdered Bincan.");
                          System.out.println("Although you have arrested the murderer, you don't know why he murdered Bincan.");
                          System.out.println("GOOD ENDING #2");
                          break;
                      }
                  }
              }
  }
   private static void Witness(String detectiveName) {
       Scanner console = new Scanner(System.in);
       System.out.println("There are 4 witnesses to talk to. Which one would you like to talk to first?");
       System.out.println("1. Maid");
       System.out.println("2. Receptionist");
       System.out.println("3. Janitor");
       System.out.println("4. The Neighbor");
       int firstWitness = console.nextInt();
       if (firstWitness == 1) {
           Maid(detectiveName);
       } else if (firstWitness == 2) {  
           Receptionist(detectiveName);
       } else if (firstWitness == 3) {
           Deffery(detectiveName);
       } else {
           Bob(detectiveName);
       }
       if (firstWitness == 1) {
           System.out.println("Which witness would you like to interrogate next?");
           System.out.println("1. Receptionist");
           System.out.println("2. Janitor");
           System.out.println("3. The Neighbor");
           int secondWitness = console.nextInt();
           if (secondWitness == 1) {
               Receptionist(detectiveName);
               System.out.println("Which witness would you like to interrogate next?");
               System.out.println("1. Janitor");
               System.out.println("2. The Neighbor");
               int thirdWitness = console.nextInt();
               if (thirdWitness == 1) {
                   Deffery(detectiveName);
                   System.out.println("Would you like to interrogate the last witness?");
                   System.out.println("1. Yes, I would like to interrogate the neighbor.");
                   System.out.println("2. No, I am done interrogating witnesses.");
                   int lastWitness = console.nextInt();
                   if (lastWitness == 1) {
                       Bob(detectiveName);   
                   }
               } else {
                   Bob(detectiveName);
                   System.out.println("Would you like to interrogate the last witness?");
                   System.out.println("1. Yes, I would like to interrogate the janitor.");
                   System.out.println("2. No, I am done interrogating witnesses.");
                   int lastWitness = console.nextInt();
                   if (lastWitness == 1) {
                       Deffery(detectiveName);   
                   }  
               }
           } else if (secondWitness == 2) {
               Deffery(detectiveName);
               System.out.println("Which witness would you like to interrogate next?");
               System.out.println("1. Receptionist");
               System.out.println("2. Hotel Room Neighbor");
               int thirdWitness = console.nextInt();
               if (thirdWitness == 1) {
                   Receptionist(detectiveName);
                   System.out.println("Would you like to interrogate the last witness?");
                   System.out.println("1. Yes, I would like to interrogate the neighbor");
                   System.out.println("2. No, I am done interrogating witnesses");
                   int lastWitness = console.nextInt();
                   if (lastWitness == 1) {
                       Bob(detectiveName);
                   }
               } else {
                   Bob(detectiveName);
                   System.out.println("Would you like to interrogate the last witness?");
                   System.out.println("1. Yes, I would like to interrogate the receptionist.");
                   System.out.println("2. No, I am done interrogating witnesses.");
                    int lastWitness = console.nextInt();
                   if (lastWitness == 1) {
                       Receptionist(detectiveName);
                   }
               }
           } else {
               Bob(detectiveName);
               System.out.println("1. Receptionist.");
               System.out.println("2. Janitor");
               int thirdWitness = console.nextInt();
               if (thirdWitness == 1) {
                   Receptionist(detectiveName);
                   System.out.println("Would you like to interrogate the last witness?");
                   System.out.println("1. Yes, I would like to interrogate the janitor.");
                   System.out.println("2. No, I am done interrogating witnesses.");
                   int lastWitness = console.nextInt();
                   if (lastWitness == 1) {
                       Deffery(detectiveName);
                   }
               } else {
                   Deffery(detectiveName);
                   System.out.println("Would you like to interrogate the last witness?");
                   System.out.println("1. Yes, I would like to interrogate the receptionist.");
                   System.out.println("2. No, I am done interrogating witnesses.");
                   int lastWitness = console.nextInt();
                   if (lastWitness == 1) {
                       Receptionist(detectiveName);
                   }
               }
           }
       } else if (firstWitness == 2) {
                System.out.println("Which witness would you like to interrogate next?");
                System.out.println("1. Maid");
                System.out.println("2. Janitor");
                System.out.println("3. The Neighbor");
                int secondWitness = console.nextInt();
                if (secondWitness == 1) {
                    Maid(detectiveName);
                    System.out.println("Which witness would you like to interrogate next?");
                    System.out.println("1. Janitor.");
                    System.out.println("2. The Neighbor.");
                    int thirdWitness = console.nextInt();
                    if (thirdWitness == 1) {
                        Deffery(detectiveName);
                        System.out.println("Would you like to interrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the neighbor.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Bob(detectiveName);
                        }
                    } else {
                        Bob(detectiveName);
                        System.out.println("Would you like to inerrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the janitor.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Deffery(detectiveName);
                        }
                    }
                } else if (secondWitness == 2) {
                        Deffery(detectiveName);
                        System.out.println("Which witness would you like to interrogate next?");
                        System.out.println("1. Maid.");
                        System.out.println("2. The Neighbor.");
                        int thirdWitness = console.nextInt();
                        if (thirdWitness == 1) {
                            Maid(detectiveName);
                            System.out.println("Would you like to interrogate the last witness?");
                            System.out.println("1. Yes, I would like to interrogate the neighbor.");
                            System.out.println("2. No, I am done interrogating witnesses.");
                            int lastWitness = console.nextInt();
                            if (lastWitness == 1) {
                                Bob(detectiveName);
                            }
                        } else {
                            Bob(detectiveName);
                            System.out.println("Would you like to interrogate the last witness?");
                            System.out.println("1. Yes, I would like to interrogate the maid.");
                            System.out.println("2. No, I am done interrogating witnesses.");
                            int lastWitness = console.nextInt();
                            if (lastWitness == 1) {
                                Maid(detectiveName);
                            }
                        }
                } else {
                        Bob(detectiveName);
                        System.out.println("Which witness would you like to interrogate next?");
                        System.out.println("1. Maid.");
                        System.out.println("2. Janitor.");
                        int thirdWitness = console.nextInt();
                        if (thirdWitness == 1) {
                            Maid(detectiveName);
                            System.out.println("Would you like to interrogate the last witness?");
                            System.out.println("1. Yes, I would like to interrogate the janitor.");
                            System.out.println("2. No, I am done interrogating witnesses.");
                            int lastWitness = console.nextInt();
                            if (lastWitness == 1) {
                                Deffery(detectiveName);
                            }
                        } else {
                            Deffery(detectiveName);
                            System.out.println("Would you like to interrogate the last witness?");
                            System.out.println("1. Yes, I would like to interrogate the maid.");
                            System.out.println("2. No, I am done interrogating witnesses.");
                            int lastWitness = console.nextInt();
                            if (lastWitness == 1) {
                                Maid(detectiveName);
                            } 
                        }
                }
       } else if (firstWitness == 3) {
                System.out.println("Which witness would you like to interrogate next?");
                System.out.println("1. Maid");
                System.out.println("2. Receptionist");
                System.out.println("3. The Neighbor");
                int secondWitness = console.nextInt();
                if (secondWitness == 1) {
                    Maid(detectiveName);
                    System.out.println("Which witness would you like to interrogate next?");
                    System.out.println("1. Receptionist.");
                    System.out.println("2. The Neighbor.");
                    int thirdWitness = console.nextInt();
                    if (thirdWitness == 1) {
                         Receptionist(detectiveName);
                         System.out.println("Would you like to interrogate the last witness?");
                         System.out.println("1. Yes, I would like to interrogate the neighbor.");
                         System.out.println("2. No, I am done interrogating witnesses.");
                         int lastWitness = console.nextInt();
                         if (lastWitness == 1){
                             Bob(detectiveName);
                         }
                    } else {
                         Bob(detectiveName);
                         System.out.println("Would you like to interrogate the last witness?");
                         System.out.println("1. Yes, I would like to interrogate the neighbor.");
                         System.out.println("2. No, I am done interrogating witnesses.");
                         int lastWitness = console.nextInt();
                         if (lastWitness == 1) {
                             Receptionist(detectiveName);
                         }
                    }
                } else if (secondWitness == 2) {
                    Receptionist(detectiveName);
                    System.out.println("Which witness would you like to interrogate next?");
                    System.out.println("1. Maid.");
                    System.out.println("2. The Neighbor.");
                    int thirdWitness = console.nextInt();
                    if (thirdWitness == 1) {
                        Maid(detectiveName);
                        System.out.println("Would you like to interrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the neighbor.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Bob(detectiveName);
                        }
                    } else {
                        Bob(detectiveName);
                        System.out.println("Would you like to interrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the maid.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Maid(detectiveName);
                        }
                    } 
                } else {
                    Bob(detectiveName);
                    System.out.println("Which witness would you like to interrogate next?");
                    System.out.println("1. Maid.");
                    System.out.println("2. Receptionist.");
                    int thirdWitness = console.nextInt();
                    if (thirdWitness == 1) {
                        Maid(detectiveName);
                        System.out.println("Would you like to interrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the receptionist.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Receptionist(detectiveName);
                        }
                    } else {
                        Receptionist(detectiveName);
                        System.out.println("Would you like to interrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the maid.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Maid(detectiveName);
                        }
                    }
                }
       } else {
                System.out.println("Which witness would you like to interrogate next?");
                System.out.println("1. Maid");
                System.out.println("2. Receptionist");
                System.out.println("3. Janitor");
                int secondWitness = console.nextInt();
                if (secondWitness == 1) {
                    Maid(detectiveName);
                    System.out.println("Which witness would you like to interrogate next?");
                    System.out.println("1. Receptionist.");
                    System.out.println("2. Janitor.");
                    int thirdWitness = console.nextInt();
                    if (thirdWitness == 1) {
                        Receptionist(detectiveName);
                        System.out.println("Would you like to interrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the janitor.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Deffery(detectiveName);
                        }
                    } else {
                        Deffery(detectiveName);
                        System.out.println("Would you like to interrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the receptionist.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Receptionist(detectiveName);
                        }
                    }
                } else if (secondWitness == 2) {
                    Receptionist(detectiveName);
                    System.out.println("Which witness would you like to interrogate next?");
                    System.out.println("1. Maid.");
                    System.out.println("2. Janitor.");
                    int thirdWitness = console.nextInt();
                    if (thirdWitness == 1) {
                        Maid(detectiveName);
                        System.out.println("Would you like to interrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the janitor.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Deffery(detectiveName);
                        }
                    } else {
                        Deffery(detectiveName);
                        System.out.println("Would you like to interrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the maid.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Maid(detectiveName);
                        }
                    }
                } else {
                    Deffery(detectiveName);
                    System.out.println("Which witness would you like to interrogate next?");
                    System.out.println("1. Maid.");
                    System.out.println("2. Receptionist.");
                    int thirdWitness = console.nextInt();
                    if (thirdWitness == 1) {
                        Maid(detectiveName);
                        System.out.println("Would you like to interrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the receptionist.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Receptionist(detectiveName);
                        }
                    } else {
                        Receptionist(detectiveName);
                        System.out.println("Would you like to interrogate the last witness?");
                        System.out.println("1. Yes, I would like to interrogate the maid.");
                        System.out.println("2. No, I am done interrogating witnesses.");
                        int lastWitness = console.nextInt();
                        if (lastWitness == 1) {
                            Maid(detectiveName);
                        }
                    }
                }
       }
  }
    private static void Receptionist(String detectiveName){
      Scanner console = new Scanner(System.in);
      System.out.println("What would you like to ask first?");
      System.out.println("1. Tell us about yourself.");
      System.out.println("2. Did you have any prior contact with the victim?");
      System.out.println("3. Where were you during 12pm yesterday?");
      int firstQuestionReceptionist = console.nextInt();
      if (firstQuestionReceptionist == 1) {
          System.out.println(detectiveName + ": Tell us about yourself.");
          System.out.println("Receptionist: My name is Mary Joseph. I'm 23 years old and I've just started working at this hotel this year.");
          System.out.println("What would you like to ask next?");
          System.out.println("1. Did you have any prior contact with the victim?");
          System.out.println("2. Where were you during 12pm yesterday?");
          int secondQuestionReceptionist = console.nextInt();
          if (secondQuestionReceptionist == 1) {
              System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
              System.out.println("Receptionist: Well, I checked him into his room 2 days ago.");
              System.out.println("Would you like to ask the last question?");
              System.out.println("1. Yes, I would like to ask them where they were yesterday during 12pm.");
              System.out.println("2. No, I would like to move on to the next witness.");
              int lastQuestionReceptionist = console.nextInt();
              if (lastQuestionReceptionist == 1) {
                  System.out.println(detectiveName + ": Where were you during 12pm yesterday?");
                  System.out.println("Receptionist: Yesterday at 12pm, I was just sitting at the reception, waiting for people to come in.");
                  System.out.println("Receptionist: There is also security footage, would you like to look at it?");
                  System.out.println("1. Yes.");
                  System.out.println("2. No.");
                  int lookAtSecurity = console.nextInt();
                  if (lookAtSecurity == 1) {
                      System.out.println("Looking at the security footage, you see someone entering Bincan Moongold's hotel room.");
                      System.out.println("They are wearing a black hoodie with grey pants who was entering with a black duffle bag.");
                      System.out.println("He seems to be a white male, 6 feet tall, with a beard and a tattoo on his arm spelled out GEM.");  
                  }
              }
          } else {
              System.out.println(detectiveName + ": Where were you during 12pm yesterday?");
              System.out.println("Receptionist: Yesterday at 12pm, I was just sitting at the reception, waiting for people to come in.");
              System.out.println("Would you like to ask the last question?");
              System.out.println("1. Yes, I would like to ask them if they had any prior contact with the victim.");
              System.out.println("2. No, I would like to move on to the next witness.");
              int lastQuestionReceptionist = console.nextInt();
              if (lastQuestionReceptionist == 1) {
                  System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
                  System.out.println("Receptionist: Well, I checked him into his room 2 days ago.");
                  System.out.println("Receptionist: There is also security footage, would you like to look at it?");
                  System.out.println("1. Yes.");
                  System.out.println("2. No.");
                  int lookAtSecurity = console.nextInt();
                  if (lookAtSecurity == 1) {
                      System.out.println("Looking at the security footage, you see someone entering Bincan Moongold's hotel room.");
                      System.out.println("They are wearing a black hoodie with grey pants who was entering with a black duffle bag.");
                      System.out.println("He seems to be a white male, 6 feet tall, with a beard and a tattoo on his arm spelled out GEM.");  
                  }
              }
          }
      } else if (firstQuestionReceptionist == 2) {
          System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
          System.out.println("Receptionist: Well, I checked him into his room 2 days ago.");
          System.out.println("What would you like to ask next?");
          System.out.println("1. Tell us about yourself.");
          System.out.println("2. Where were you during 12pm yesterday?");
          int secondQuestionReceptionist = console.nextInt();
          if (secondQuestionReceptionist == 1) {
              System.out.println(detectiveName + ": Tell us about yourself.");
              System.out.println("Receptionist: My name is Mary Joseph. I'm 23 years old and I've just started working at this hotel this year.");
              System.out.println("Would you like to ask the last question?");
              System.out.println("1. Yes, I would like to ask them where they were during 12pm yesterday.");
              System.out.println("2. No, I would like to move on to the next witness.");
              int lastQuestionReceptionist = console.nextInt();
              if (lastQuestionReceptionist == 1) {
                  System.out.println(detectiveName + ": Where were you during 12pm yesterday?");
                  System.out.println("Receptionist: Yesterday at 12pm, I was just sitting at the reception, waiting for people to come in.");
                  System.out.println("Receptionist: There is also security footage, would you like to look at it?");
                  System.out.println("1. Yes.");
                  System.out.println("2. No.");
                  int lookAtSecurity = console.nextInt();
                  if (lookAtSecurity == 1) {
                      System.out.println("Looking at the security footage, you see someone entering Bincan Moongold's hotel room.");
                      System.out.println("They are wearing a black hoodie with grey pants who was entering with a black duffle bag.");
                      System.out.println("He seems to be a white male, 6 feet tall, with a beard and a tattoo on his arm spelled out GEM.");   
                  }
              } else {
                  System.out.println(detectiveName + ": Where were you during 12pm yesterday?");
                  System.out.println("Receptionist: Yesterday at 12pm, I was just sitting at the reception, waiting for people to come in.");
                  System.out.println("Would you like to ask the last question?");
                  System.out.println("1. Yes, I would like to ask them about themselves.");
                  System.out.println("2. No, I would like to move on to the next witness.");    
                  if (lastQuestionReceptionist == 1) {
                      System.out.println(detectiveName + ": Tell us about yourself.");
                      System.out.println("Receptionist: My name is Mary Joseph. I'm 23 years old and I've just started working at this hotel this year.");
                      System.out.println("Receptionist: There is also security footage, would you like to look at it?");
                      System.out.println("1. Yes.");
                      System.out.println("2. No.");
                      int lookAtSecurity = console.nextInt();
                      if (lookAtSecurity == 1) {
                          System.out.println("Looking at the security footage, you see someone entering Bincan Moongold's hotel room.");
                          System.out.println("They are wearing a black hoodie with grey pants who was entering with a black duffle bag.");
                          System.out.println("He seems to be a white male, 6 feet tall, with a beard and a tattoo on his arm spelled out GEM.");
                      }
                  }
              }
          } else {
              System.out.println(detectiveName + ": Where were you during 12pm yesterday?");
              System.out.println("Receptionist: Yesterday at 12pm, I was just sitting at the reception, waiting for people to come in.");
              System.out.println("What would you like to ask next?");
              System.out.println("1. Tell us about yourself.");
              System.out.println("2. Did you have any prior contact with the victim?");
              if (secondQuestionReceptionist == 1) {
                  System.out.println(detectiveName + ": Tell us about yourself.");
                  System.out.println("Receptionist: My name is Mary Joseph. I'm 23 years old and I've just started working at this hotel this year.");
                  System.out.println("Would you like to ask the last question?");
                  System.out.println("1. Yes, I would like to ask them if they had any prior contact with the victim.");
                  System.out.println("2. No, I want to move on to the next witness.");
                  int lastQuestionReceptionist = console.nextInt();
                  if (lastQuestionReceptionist == 1) {
                      System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
                      System.out.println("Receptionist: Well, I checked him into his room 2 days ago.");
                      System.out.println("Receptionist: There is also security footage, would you like to look at it?");
                      System.out.println("1. Yes.");
                      System.out.println("2. No.");
                      int lookAtSecurity = console.nextInt();
                      if (lookAtSecurity == 1) {
                          System.out.println("Looking at the security footage, you see someone entering Bincan Moongold's hotel room.");
                          System.out.println("They are wearing a black hoodie with grey pants who was entering with a black duffle bag.");
                          System.out.println("He seems to be a white male, 6 feet tall, with a beard and a tattoo on his arm spelled out GEM.");
                      }
                  }
              } else {
                  System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
                  System.out.println("Receptionist: Well, I checked him into his room 2 days ago.");
                  System.out.println("Would you like to ask the last question?");
                  System.out.println("1. Yes, I would like to ask them about themselves.");
                  System.out.println("2. No, I want to move on to the next witness.");
                  int lastQuestionReceptionist = console.nextInt();
                  if (lastQuestionReceptionist == 1) {
                      System.out.println(detectiveName + ": Tell us about yourself.");
                      System.out.println("Receptionist: My name is Mary Joseph. I'm 23 years old and I've just started working at this hotel this year.");
                      System.out.println("Receptionist: There is also security footage, would you like to look at it?");
                      System.out.println("1. Yes.");
                      System.out.println("2. No.");
                      int lookAtSecurity = console.nextInt();
                      if (lookAtSecurity == 1) {
                          System.out.println("Looking at the security footage, you see someone entering Bincan Moongold's hotel room.");
                          System.out.println("They are wearing a black hoodie with grey pants who was entering with a black duffle bag.");
                          System.out.println("He seems to be a white male, 6 feet tall, with a beard and a tattoo on his arm spelled out GEM.");
                      }
                  }
              }
          }
      }
  }
    private static void Deffery(String detectiveName) {
    Scanner console = new Scanner(System.in);
    System.out.println("What would you like to ask first?");
    System.out.println("1. Tell us about yourself.");
    System.out.println("2. Did you have any prior contact with the victim?");
    System.out.println("3. Where were you yesterday during 12pm?");
    int firstQuestionDeffery = console.nextInt();
    if (firstQuestionDeffery == 1) {
        System.out.println(detectiveName + ": Tell us about yourself.");
        System.out.println("Deffery: My name is Deffery Jahmer and I'm 30 years old. I've been a janitor at this hotel for a couple years now.");
        System.out.println("What would you like to ask next?");
        System.out.println("1. Did you have any prior contact with the victim?");
        System.out.println("2. Where were you yesterday during 12pm?");
        int secondQuestionDeffery = console.nextInt();
        if (secondQuestionDeffery == 1) {
            System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
            System.out.println("Deffery: Nah.");
            System.out.println("Would you like to ask the last question?");
            System.out.println("1. Yes I would like to ask him where he was yesterday during 12pm.");
            System.out.println("2. No I would like to move on to the next witness.");
            int lastQuestionDeffery = console.nextInt();
            if (lastQuestionDeffery == 1) {
                System.out.println(detectiveName + ": Where were you yesterday during 12pm?");
                System.out.println("Deffery: Just mopping the hallways.");
            }
        } else {
             System.out.println(detectiveName + ": Where were you yesterday during 12pm?");
             System.out.println("Deffery: Just mopping the hallways.");
             System.out.println("Would you like to ask the last question?");
             System.out.println("1. Yes I would like to ask him whether he had any prior contact with the victim.");
             System.out.println("2. No I would like to move on to the next witness.");
             int lastQuestionDeffery = console.nextInt();
             if (lastQuestionDeffery == 1) {
                 System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
                 System.out.println("Deffery: Nah.");    
             }
        }
    } else if (firstQuestionDeffery == 2) {
        System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
        System.out.println("Deffery: Nah.");
        System.out.println("What would you like to ask next?");
        System.out.println("1. Tell us about yourself.");
        System.out.println("2. Where were you yesterday during 12pm?");
        int secondQuestionDeffery = console.nextInt();
        if (secondQuestionDeffery == 1) {
            System.out.println(detectiveName + ": Tell us about yourself.");
            System.out.println("Deffery: My name is Deffery Jahmer and I'm 30 years old. I've been a janitor at this hotel for a couple years now.");
            System.out.println("Would you like to ask the last question?");
            System.out.println("1. Yes I would like to ask him where was yesterday at 12pm");
            System.out.println("2. No I would like to move on to the next witness.");
            int lastQuestionDeffery = console.nextInt();
            if (lastQuestionDeffery == 1) {
                System.out.println(detectiveName + ": Where were you yesterday during 12pm?");
                System.out.println("Deffery: Just mopping the hallways.");
            }
        } else {
            System.out.println(detectiveName + ": Where were you yesterday during 12pm?");
            System.out.println("Deffery: Just mopping the hallways.");
            System.out.println("Would you like to ask the last question?");
            System.out.println("1. Yes I would like to ask him about himself.");
            System.out.println("2. No I would like to move on to the next witness.");
            int lastQuestionDeffery = console.nextInt();
            if (lastQuestionDeffery == 1) {
                System.out.println(detectiveName + ": Tell us about yourself.");
                System.out.println("Deffery: My name is Deffery Jahmer and I'm 30 years old. I've been a janitor at this hotel for a couple years now.");
            }
        }
    } else {
        System.out.println(detectiveName + ": Where were you yesterday during 12pm?");
        System.out.println("Deffery: Just mopping the hallways.");
        System.out.println("What would you like to ask next?");
        System.out.println("1. Tell us about yourself.");
        System.out.println("2. DId you have any prior contact with the victim?");
        int secondQuestionDeffery = console.nextInt();
        if (secondQuestionDeffery == 1) {
            System.out.println(detectiveName + ": Tell us about yourself.");
            System.out.println("Deffery: My name is Deffery Jahmer and I'm 30 years old. I've been a janitor at this hotel for a couple years now.");
            System.out.println("Would you like to ask the last question?");
            System.out.println("1. Yes I would like to ask him if he had any prior contact with the victim.");
            System.out.println("2. No I would like to move on to the next witness.");
            int lastQuestionDeffery = console.nextInt();
            if (lastQuestionDeffery == 1) {
                System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
                System.out.println("Deffery: Nah."); 
            }
        } else {
            System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
            System.out.println("Deffery: Nah.");
            System.out.println("Would you like to ask the last question?");
            System.out.println("1. Yes I would like to ask him about himself");
            System.out.println("2. No I would like to move on to the next witness.");
            int lastQuestionDeffery = console.nextInt();
            if (lastQuestionDeffery == 1) {
                System.out.println(detectiveName + ": Tell us about yourself.");
                System.out.println("Deffery: My name is Deffery Jahmer and I'm 30 years old. I've been a janitor at this hotel for a couple years now.");
            }
        }
    }
    System.out.println("You feel that Deffery's behavior is quite suspicious.");
  }
  private static void Bob(String detectiveName) {
    Scanner console = new Scanner(System.in);
    System.out.println("What would you like to ask first?");
    System.out.println("1. Tell us about yourself.");
    System.out.println("2. Did you have any prior contact with the victim?");
    System.out.println("3. Where were you yesterday at 12pm?");
    int firstQuestionBob = console.nextInt();
    if (firstQuestionBob == 1) {
        System.out.println(detectiveName + ": Tell us about yourself.");
        System.out.println("Bob: My name is Bob and I'm 34 years old. I work in a jewelery store and have a wife and kids.");
        System.out.println("What would you like to ask next?");
        System.out.println("1. Did you have any prior contact with the victim?");
        System.out.println("2. Where were you yesterday at 12pm?");
        int secondQuestionBob = console.nextInt();
        if (secondQuestionBob == 1) {
            System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
            System.out.println("Bob: I talked to him for a while yesterday for breakfast.");
            System.out.println("Would you like to ask the last question?");
            System.out.println("1. Yes, I would like to ask him where they were at 12pm yesterday.");
            System.out.println("2. No, I would like to move on the next witness.");
            int lastQuestionBob = console.nextInt();
            if (lastQuestionBob == 1) {
                System.out.println(detectiveName + ": Where were you yesterday at 12pm?");
                System.out.println("Bob: I was just sitting in my room, watching TV.");
            }
        } else {
            System.out.println(detectiveName + ": Where were you yesterday at 12pm?");
            System.out.println("Bob: I was just sitting in my room, watching TV.");
            System.out.println("Would you like to ask the last question?");
            System.out.println("1. Yes, I would like to ask him if he had any prior contact with the victim.");
            System.out.println("2. No, I would like to move onto the next witness.");
            int lastQuestionBob = console.nextInt();
            if (lastQuestionBob == 1) {
                System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
                System.out.println("Bob: I talked to him for a while yesterday for breakfast.");
            }
        }  
    } else if (firstQuestionBob == 2) {
        System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
        System.out.println("Bob: I talked to him for a while yesterday for breakfast.");
        System.out.println("What would you like to ask next?");
        System.out.println("1. Tell us about yourself.");
        System.out.println("2. Where were you yesterday at 12pm?");
        int secondQuestionBob = console.nextInt();
        if (secondQuestionBob == 1) {
            System.out.println(detectiveName + ": Tell us about yourself.");
            System.out.println("Bob: My name is Bob and I'm 34 years old. I work in a jewelery store and have a wife and kids.");
            System.out.println("Would you like to ask the last question?");
            System.out.println("1. Yes, I would like to ask where he was at 12pm yesterday.");
            System.out.println("2. No, I would like to move onto the next witness.");
            int lastQuestionBob = console.nextInt();
            if (lastQuestionBob == 1) {
                System.out.println(detectiveName + ": Where were you yesterday at 12pm?");
                System.out.println("Bob: I was just sitting in my room, watching TV.");
            }
        } else {
            System.out.println(detectiveName + ": Where were you yesterday at 12pm?");
            System.out.println("Bob: I was just sitting in my room, watching TV.");
            System.out.println("Would you like to ask the last question?");
            System.out.println("1. Yes, I would like to ask him about himself.");
            System.out.println("2. No, I would like to move onto the next witness.");
            int lastQuestionBob = console.nextInt();
            if (lastQuestionBob == 1) {
                System.out.println(detectiveName + ": Tell us about yourself.");
                System.out.println("Bob: My name is Bob and I'm 34 years old. I work in a jewelery store and have a wife and kids.");
            }  
        } 
    } else {
        System.out.println(detectiveName + ": Where were you yesterday at 12pm?");
        System.out.println("Bob: I was just sitting in my room, watching TV.");
        System.out.println("What would you like to ask next?");
        System.out.println("1. Tell us about yourself.");
        System.out.println("2. Did you have any prior contact with the victim?");
        int secondQuestionBob = console.nextInt();
        if (secondQuestionBob == 1) {
            System.out.println(detectiveName + ": Tell us about yourself.");
            System.out.println("Bob: My name is Bob and I'm 34 years old. I work in a jewelery store and have a wife and kids.");
            System.out.println("Would you like to ask the last question?");
            System.out.println("1. Yes, I would like to ask him if he had any prior contact with the victim.");
            System.out.println("2. No, I would like to move onto the next witness.");
            int lastQuestionBob = console.nextInt();
            if (lastQuestionBob == 1) {
                System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
                System.out.println("Bob: I talked to him for a while yesterday for breakfast.");
            }
        } else {
            System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
            System.out.println("Bob: I talked to him for a while yesterday for breakfast.");
            System.out.println("Would you like to ask the last question?");
            System.out.println("1. Yes, I would like to ask him about himself.");
            System.out.println("2. No, I would like to move onto the next witness.");
            int lastQuestionBob = console.nextInt();
            if (lastQuestionBob == 1) {
                System.out.println(detectiveName + ": Tell us about yourself.");
                System.out.println("Bob: My name is Bob and I'm 34 years old. I work in a jewelery store and have a wife and kids.");
            }
        }
    }
  }
  private static void Maid(String detectiveName) {
    Scanner console = new Scanner(System.in);
    System.out.println("What would you like to ask first?");
    System.out.println("1. Tell us about yourself.");
    System.out.println("2. Did you have any prior contact with the victim?");
    System.out.println("3. When did you find the body?");
    int firstQuestionMaid = console.nextInt();
    if (firstQuestionMaid == 1) {
         System.out.println(detectiveName + ": Tell us about yourself.");
         System.out.println("Maid: My name is Pushmeet Goodpasture. I'm 43 years old and I've been a maid at this hotel for about 10 years.");
         System.out.println("Maid: I've also been married for 15 years and have 2 kids.");
    } else if (firstQuestionMaid == 2) {
         System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
         System.out.println("Maid: Yes, one time I knocked on his door to ask if wanted me to clean his room, he said no though.");  
    } else {
         System.out.println(detectiveName + ": When did you find the body?");
         System.out.println("Maid: I was just on my normal routine of cleaning rooms yesterday, when I went to Mr. Moongold's room.");
         System.out.println("The door was open, so I went in and I found his body. I think it was around 2pm when I found his body.");     
    }
    if (firstQuestionMaid == 1) {
         System.out.println("What question would you like to ask next?");
         System.out.println("1. Did you have any prior contact with the victim?");
         System.out.println("2. When did you find the body?");
         int secondQuestionMaid = console.nextInt();
         if (secondQuestionMaid == 1) {
             System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
             System.out.println("Maid: Yes, one time I knocked on his door to ask if wanted me to clean his room, he said no though.");
             System.out.println("Would you like to ask the last question or move on to the next witness?");
             System.out.println("1. Move on to the next witness.");
             System.out.println("2. Ask the last question.");
             int lastQuestionMaid = console.nextInt();
             if (lastQuestionMaid == 2) {
                  System.out.println(detectiveName + ": When did you find the body?");
                  System.out.println("Maid: I was just on my normal routine of cleaning rooms yesterday, when I went to Mr. Moongold's room.");
                  System.out.println("The door was open, so I went in and I found his body. I think it was around 2pm when I found his body.");    
             }
         } else {
              System.out.println(detectiveName + ": When did you find the body?");
              System.out.println("Maid: I was just on my normal routine of cleaning rooms yesterday, when I went to Mr. Moongold's room.");
              System.out.println("The door was open, so I went in and I found his body. I think it was around 2pm when I found his body.");
              System.out.println("Would you like to ask the last question or move on to the next witness?");
              System.out.println("1. Move on to the next witness.");
              System.out.println("2. Ask the last question.");
              int lastQuestionMaid = console.nextInt();
              if (lastQuestionMaid == 2){
                  System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
                  System.out.println("Maid: Yes, one time I knocked on his door to ask if wanted me to clean his room, he said no though.");   
              }
         }
    } else if (firstQuestionMaid == 2) {
         System.out.println("What question would you like to ask next?");
         System.out.println("1. Tell us about yourself.");
         System.out.println("2. When did you find the body?");
         int secondQuestionMaid = console.nextInt();
         if (secondQuestionMaid == 1) {
              System.out.println(detectiveName + ": Tell us about yourself.");
              System.out.println("Maid: My name is Pushmeet Goodpasture. I'm 43 years old and I've been a maid at this hotel for about 10 years.");
              System.out.println("Maid: I've also been married for 15 years and have 2 kids.");
              System.out.println("Would you like to ask the last question or move on to the next witness?");
              System.out.println("1. Move on to the next witness.");
              System.out.println("2. Ask the last question.");
              int lastQuestionMaid = console.nextInt();
              if (lastQuestionMaid == 2) {
                   System.out.println(detectiveName + ": When did you find the body?");
                   System.out.println("Maid: I was just on my normal routine of cleaning rooms yesterday, when I went to Mr. Moongold's room.");
                   System.out.println("The door was open, so I went in and I found his body. I think it was around 2pm when I found his body.");  
              }
         } else {
              System.out.println(detectiveName + ": When did you find the body?");
              System.out.println("Maid: I was just on my normal routine of cleaning rooms yesterday, when I went to Mr. Moongold's room.");
              System.out.println("The door was open, so I went in and I found his body. I think it was around 2pm when I found his body.");
              System.out.println("Would you like to ask the last question or move on to the next witness?");
              System.out.println("1. Move on to the next witness.");
              System.out.println("2. Ask the last question.");
              int lastQuestionMaid = console.nextInt();
              if (lastQuestionMaid == 2) {
                   System.out.println(detectiveName + ": Tell us about yourself.");
                   System.out.println("Maid: My name is Pushmeet Goodpasture. I'm 43 years old and I've been a maid at this hotel for about 10 years.");
                   System.out.println("Maid: I've also been married for 15 years and have 2 kids.");
                   System.out.println("Would you like to ask the last question or move on to the next witness?");  
              }
         }
    } else {
         System.out.println("What question would you like to ask next?");
         System.out.println("1. Tell us about yourself.");
         System.out.println("2. Did you have any prior contact with the victim?");
         int secondQuestionMaid = console.nextInt();
         if (secondQuestionMaid == 1) {
              System.out.println(detectiveName + ": Tell us about yourself.");
              System.out.println("Maid: My name is Pushmeet Goodpasture. I'm 43 years old and I've been a maid at this hotel for about 10 years.");
              System.out.println("Maid: I've also been married for 15 years and have 2 kids.");
              System.out.println("Would you like to ask the last question or move on to the next witness?");
              System.out.println("1. Move on to the next witness.");
              System.out.println("2. Ask the last question.");
              int lastQuestionMaid = console.nextInt();
              if (lastQuestionMaid == 2){
                   System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
                   System.out.println("Maid: Yes, one time I knocked on his door to ask if wanted me to clean his room, he said no though.");
              }
         } else {
              System.out.println(detectiveName + ": Did you have any prior contact with the victim?");
              System.out.println("Maid: Yes, one time I knocked on his door to ask if wanted me to clean his room, he said no though.");
              System.out.println("Would you like to ask the last question or move on to the next witness?");
              System.out.println("1. Move on to the next witness.");
              System.out.println("2. Ask the last question.");
              int lastQuestionMaid = console.nextInt();
              if (lastQuestionMaid == 2) {
                   System.out.println(detectiveName + ": Tell us about yourself.");
                   System.out.println("Maid: My name is Pushmeet Goodpasture. I'm 43 years old and I've been a maid at this hotel for about 10 years.");
                   System.out.println("Maid: I've also been married for 15 years and have 2 kids.");
              }
         }
    }
  }
}
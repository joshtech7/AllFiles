def display_main_menu(): 
 print("1. Phone book") 
 print("2. Messages") 
 print("3. Chat") 
 print("4. Call Register") 
 print("5. Tones") 
 print("6. Settings") 
 print("7. Call Divert") 
 print("8. Games") 
 print("9. Calculator") 
 print("10. Reminders") 
 print("11. Clock") 
 print("12. Profiles") 
 print("13. SIM Services")

def display_phone_book_submenu(): 
 print("1. Search") 
 print("2. Service Nos") 
 print("3. Add name") 
 print("4. Erase") 
 print("5. Edit") 
 print("6. Assign tone") 
 print("7. Send b'card") 
 print("8. Options") 
 print("9. Speed dials") 
 print("10. Voice tags") 
 print("0. Back")

def handle_phone_booksearch(): 
 print("Search")

def handle_phone_book_options(): 
 print("1. Type of view") 
 print("2. Memory status")

def display_messages_submenu(): 
 print("1. Write and send a text message") 
 print("2. Read text message") 
 print("3. Views saved messages") 
 print("4. Picture message") 
 print("5. Templates") 
 print("6. Smileys") 
 print("7. Message settings") 
 print("8. Info service") 
 print("9. Voice mailbox number") 
 print("10. Service command editor")

def handle_message_settings():
 print("Message settings")

def display_chat_submenu(): 
 print("1. Start a chat") 
 print("2. Read received message")

def handle_chat_options(): 
 print("1. Edit chat name") 
 print("2. View chat history")

def display_call_register_submenu(): 
 print("1. Missed calls") 
 print("2. Received calls") 
 print("3. Dialled numbers") 
 print("4. Erased recent call lists") 
 print("5. Show call duration") 
 print("6. Show call costs") 
 print("7. Show costs in") 
 print("8. Call cost settings") 
 print("9. Prepaid credit")

def handle_show_call_duration(): 
 print("1. Last call duration") 
 print("2. All calls' duration") 
 print("3. Received calls' duration") 
 print("4. Dialled calls' duration") 
 print("5. Clear timers")

def handle_call_cost_settings(): 
 print("1. Call cost limit") 
 print("2. Show cost")

def display_tones_sub_menu(): 
 print("1. Ringing tone") 
 print("2. Ringing volume") 
 print("3. Incoming call alert") 
 print("4. Composer") 
 print("5. Message alert tone") 
 print("6. Keypad tones") 
 print("7. Warning tones") 
 print("8. Vibrating alert") 
 print("9. Screen saver")

def handle_composer(): 
 print("1. Play") 
 print("2. Save") 
 print("3. Tempo") 
 print("4. Clear screen") 
 print("5. Exit")

def display_settings_sub_menu(): 
 print("1. Call settings") 
 print("2. Phone settings") 
 print("3. Security settings") 
 print("4. Restore factory settings")

def handle_call_settings(): 
 print("1. Automatic redial") 
 print("2. Speed dialling") 
 print("3. Call waiting options") 
 print("4. Own number sending") 
 print("5. Phone line in use") 
 print("6. Automatic answer")

def handle_phone_settings(): 
 print("1. Language") 
 print("2. Cell info display") 
 print("3. Welcome note") 
 print("4. Network selection") 
 print("5. Lights") 
 print("6. Confirm SIM service actions")

def handle_security_settings(): 
 print("1. PIN code request") 
 print("2. Call barring sevice") 
 print("3. Fixed dialing") 
 print("4. Closed user group") 
 print("5. Phone security") 
 print("6. Change access codes")

def display_call_divert_submenu(): 
 print("1. Divert when busy")

def display_games_submenu(): 
 print("1. Snake II") 
 print("2. Space Impact") 
 print("3. Bantumi") 
 print("4. Pairs II") 
 print("5. Settings")

def display_calculator_submenu(): 
 print("1. Calculation") 
 print("2. Currency conversion") 
 print("3. Currency conversion in standby mode")

def display_reminder_submenu(): 
 print("1. Add new") 
 print("2. Erase") 
 print("3. View all")

def display_clock_submenu(): 
 print("1. Alarm clock") 
 print("2. Clock settings") 
 print("3. Date setting") 
 print("4. Stopwatch") 
 print("5. Countdown timer") 
 print("6. Automatic date and time")

def display_profiles_submenu(): 
 print("1. Silent") 
 print("2. Personalise") 
 print("3. General")

def display_sim_services_submenu(): 
 pass

def main():
    while True:
        display_main_menu()
        user_input = int(input("Enter your choice: "))

        if user_input == 1:
            handle_phone_booksearch()
        elif user_input == 2:
            display_messages_submenu()
        elif user_input == 3:
            display_chat_submenu()
        elif user_input == 4:
            display_call_register_submenu()
        elif user_input == 5:
            display_tones_submenu()
        elif user_input == 6:
            display_settings_submenu()
        elif user_input == 7:
            display_call_divert_submenu()
        elif user_input == 8:
            display_games_submenu()
        elif user_input == 9:
            display_calculator_submenu()
        elif user_input == 10:
            display_reminder_submenu()
        elif user_input == 11:
            display_clock_submenu()
        elif user_input == 12:
            display_profiles_submenu()
        elif user_input == 13:
            display_sim_services_submenu()
        else:
            break

if _name_ == "_main_":
    main()
# Automated web testing project using Selenium WebDriver on Guru99 demo banking application.
Implemented test scenarios for customer creation, editing, and validation using Java, TestNG, and Cucumber for BDD. The framework includes reusable functions, shared driver management, and hooks

<a href="#"
   style="
     display: inline-flex;
     align-items: center;
     gap: 10px;
     padding: 12px 22px;
     border-radius: 12px;
     border: 10px solid transparent;
     background: linear-gradient(#0b0b0b, #0b0b0b) padding-box,
                 linear-gradient(90deg, #00f0ff, #9b5cff) border-box;
     color: white;
     font-weight: 600;
     text-decoration: none;
     font-family: Arial, sans-serif;
   ">
   <span style="font-size:18px;">🏠</span>
   Try Now
   <span style="font-size:18px;">→</span>
</a>

## 📚 Project Scope

This repository includes:  
* **Manual Test Documentation**  
* **Automated Web Testing Framework**  

  * Java  
  * Selenium WebDriver  
  * Cucumber (BDD)  
  * TestNG  
* **Data-Driven & Regression Testing**  

  * Excel / CSV / Scenario Outline  

---

## 🧩 Used language 

| Category             | Tools                                        |
| -------------------- | -------------------------------------------- |
| Language             | Java                                         |
| Automation Framework | Selenium WebDriver + TestNG + Cucumber       |
| Test Runner          | Maven                                        |
| Manual Testing       | Guru99 Demo Web Application                  |
| Reporting            | Cucumber HTML Reports, TestNG Execution Logs, allure ,jira Bug report |

---

## 🚀 Features

✔ BDD using Gherkin  
✔ Page Object Model (POM) structure  
✔ Data-driven execution via CSV and Scenario Outline  
✔ End-to-end scenario automation  
✔ Modular and reusable utilities  
✔ Supports regression, negative, and validation testing  
✔ Continuous test reporting with screenshots  

---

# Test Case Samples

| TestCase ID        | Title                        | Pre-condition  | Steps                                       | Expected Result                             | Type       | Priority |
| ----------------- | ---------------------------- | -------------- | ------------------------------------------- | ------------------------------------------- | ---------- | -------- |
| TC_LOGIN_001       | Successful login             | None           | Enter valid credentials and click Login    | User navigates to homepage                  | Functional | High     |
| TC_CUST_001        | Add new customer             | Logged in      | Fill customer form and submit              | Customer created successfully               | Functional | High     |
| TC_CUST_002        | Edit customer                | Customer exists| Navigate to Edit Customer, update details | Changes saved successfully                  | Functional | High     |
| TC_CUST_003        | Edit customer invalid data   | Customer exists| Enter invalid details and submit           | Validation messages displayed               | Functional | High     |
| TC_CUST_004        | Delete customer              | Customer exists| Delete the customer                         | Customer deleted successfully               | Functional | Medium   |

📎 Full test suite and bug reports:  
[Google Sheet Example]([https://docs.google.com/spreadsheets/d/1WQCFs7W8hVGIZ4bgPn9ORz6M2nqb7BldCLi13V_ZzH8/edit?usp=sharing](https://docs.google.com/spreadsheets/d/1mqocgz6tmASPXvtQ-BlfZw2ISK8QN4JbwETswWVKKCQ/edit?gid=1420416069#gid=1420416069))

---

# 📊 Execution Summary

* **66 Total Test Cases**  
* **50 Passed**  
* **16 Failed**

### 🔎 Defects Identified

| Bug ID  | Description                                   | Expected                   | Actual                        | Severity |
| ------- | --------------------------------------------- | -------------------------- | ----------------------------- | -------- |
| BUG-001 | Customer name allows numbers                  | Should reject numbers      | Accepted "John123"            | High     |
| BUG-002 | Blank address field allows submission         | Should reject              | Form submitted successfully   | High     |
| BUG-003 | Special characters allowed in City field     | Should reject              | Accepted "@Cairo!"            | Medium   |

Execution performed:  

1. **Manually via Guru99 Demo Web App**  
2. **Automated using Selenium WebDriver & Cucumber**  

---

# Data-Driven Test Execution

*  Scenario Outline used for multi-scenario testing  

Observed issues:  

1. Validation messages sometimes inconsistent  
2. UI responsiveness slower than expected for certain forms  
3. Certain fields allow invalid input (numbers, special characters)
#  PNG Samples
<img width="787" height="401" alt="image" src="https://github.com/user-attachments/assets/db3edac1-cc19-4570-9f6d-74c8e6aee576" />


 <img width="807" height="437" alt="image" src="https://github.com/user-attachments/assets/82facd9f-082d-4ed5-b445-94d070f03d87" />

<img width="832" height="826" alt="image" src="https://github.com/user-attachments/assets/f776e734-3b51-4cff-aa6f-7382bc614471" />

#  Author

- **Moheb Ashraf**
- **Hanan reda**
- **Esraa**

Manual &  Automation Tester Engineer


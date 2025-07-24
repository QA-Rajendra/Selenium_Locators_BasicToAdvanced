# Selenium_Locators_BasicToAdvanced
# ✅ XPath Summary Table (Basic to Advanced)

## 📌 Basic XPath Types

| Type             | Description                                 | Syntax / Example                                      |
|------------------|---------------------------------------------|--------------------------------------------------------|
| **1. Basic XPath**       | Direct path to the element                    | `//tagname[@attribute='value']` → `//input[@id='username']` |
| **2. Absolute XPath**    | Starts from root (`/html`)                   | `/html/body/div[1]/form/input[1]`                    |
| **3. Relative XPath**    | Starts from anywhere using `//`             | `//input[@name='email']`                             |
| **4. contains()**        | Partial match of attribute value            | `//input[contains(@id, 'user')]`                     |
| **5. starts-with()**     | Matches beginning of value                  | `//button[starts-with(@id, 'btn_')]`                 |
| **6. text()**            | Match based on visible text                | `//a[text()='Login']`                                |
| **7. normalize-space()** | Removes whitespace from text                | `//span[normalize-space(text())='Submit']`           |
| **8. and**               | Combine multiple attribute conditions       | `//input[@type='text' and @name='username']`         |
| **9. or**                | Match if either condition is true           | `//input[@id='email' or @name='email']`              |
| **10. index**            | Select element by position in list          | `(//input[@type='text'])[2]`                         |
| **11. * (wildcard)**     | Matches any tag                             | `//*[@id='username']`                                |

---

## 🧭 XPath Axes – Advanced Selectors

| Axis                   | Use Case                                  | Example XPath                                              |
|------------------------|--------------------------------------------|------------------------------------------------------------|
| **parent::**           | Go to parent of current node               | `//input[@id='email']/parent::div`                         |
| **child::**            | Select direct children                     | `//div[@id='form']/child::input`                           |
| **ancestor::**         | Go to any ancestor (parent, grandparent)   | `//input[@id='password']/ancestor::form`                   |
| **descendant::**       | Any child, grandchild, nested node         | `//form[@id='login']/descendant::input`                    |
| **following::**        | All nodes after current one in DOM         | `//label[text()='Email']/following::input`                 |
| **preceding::**        | All nodes before current one in DOM        | `//input[@id='password']/preceding::label`                 |
| **following-sibling::**| Siblings after current node                | `//label[@for='email']/following-sibling::input`           |
| **preceding-sibling::**| Siblings before current node               | `//input[@id='email']/preceding-sibling::label`            |
| **self::**             | Selects current node itself                | `//input[@id='email']/self::input`                         |
| **descendant-or-self::**| Select node and all its descendants       | `//div[@id='container']/descendant-or-self::input`         |
| **ancestor-or-self::** | Current node and its ancestors             | `//input[@id='email']/ancestor-or-self::form`              |

---

## 🧪 Dynamic XPath Techniques (for changing/auto-generated IDs)

| Technique           | Example                                                     |
|---------------------|-------------------------------------------------------------|
| **Using contains()**      | `//input[contains(@id, 'user_')]`                              |
| **Using starts-with()**   | `//div[starts-with(@class, 'alert-')]`                        |
| **Using text partial match** | `//a[contains(text(), 'Click Here')]`                      |
| **Combining logic**       | `//button[contains(@id,'submit') and @type='button']`         |

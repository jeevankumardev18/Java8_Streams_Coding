# Java 8 Streams 75 Days Coding Challenge 🚀

![Java](https://img.shields.io/badge/Java-8-orange)
![Streams](https://img.shields.io/badge/Java-Streams-blue)
![Practice](https://img.shields.io/badge/Coding-Practice-green)
![Status](https://img.shields.io/badge/Progress-Active-success)

## 📌 About This Repository

This repository contains my structured practice of **Java 8 Stream API coding problems**.
I am solving **5 problems daily** to strengthen my Java backend development skills and improve problem-solving ability for product-based and service-based company interviews.

## 🎯 Challenge Details

| Challenge      | Details                            |
|----------------|------------------------------------|
| Total Problems | 75                                 |
| Daily Goal     | 5 Problems                         |
| Duration       | 15 Days                            |
| Focus          | Java Streams + Collections         |
| Purpose        | Interview Preparation              |
| Difficulty     | Beginner → Intermediate → Advanced |

## 📅 Progress Tracker

| Day    | Problems | Status         |
|--------|----------|----------------|
| Day 1  | 1–5      | ✅ Completed    |
| Day 2  | 6–10     | ✅ Completed    |
| Day 3  | 11–15    | ✅ Completed    |
| Day 4  | 16–20    | ✅ Completed    |
| Day 5  | 21–25    | ✅ Completed    |
| Day 6  | 26–30    | ✅ Completed    |
| Day 7  | 31–35    | ✅ Completed    |
| Day 8  | 36–40    | ✅ Completed    |
| Day 9  | 41–45    | 🔄 In Progress |
| Day 10 | 46–50    | ⏳ Pending      |
| Day 11 | 51–55    | ⏳ Pending      |
| Day 12 | 56–60    | ⏳ Pending      |
| Day 13 | 61–65    | ⏳ Pending      |
| Day 14 | 66–70    | ⏳ Pending      |
| Day 15 | 71–75    | ⏳ Pending      |

## 🧠 Skills Practiced

* Stream API
* Lambda Expressions
* Functional Interfaces
* Method References
* Optional API
* Collections Processing
* Data Transformations
* Clean Code Practices
* Interview Problem-Solving

## 📚 Topics Covered

### Stream Operations

* filter()
* map()
* flatMap()
* reduce()
* distinct()
* sorted()
* limit()
* skip()

### Collectors

* toList()
* toSet()
* toMap()
* groupingBy()
* partitioningBy()
* counting()
* joining()

### Real World Scenarios

* Employee object processing
* Salary sorting
* Department grouping
* Duplicate detection
* Data transformation
* Analytics style problems

## 📂 Project Structure

```
Java8-Streams-75-Challenge
│
├── Day01_Basics
├── Day02_Filter_Map
├── Day03_Sorting
├── Day04_Distinct
├── Day05_Reduce
├── Day06_Collectors
├── Day07_Grouping
├── Day08_Optional
├── Day09_CustomObjects
├── Day10_AdvancedStreams
├── Day11_Practice
├── Day12_Practice
├── Day13_Practice
├── Day14_Practice
├── Day15_FinalPractice
│
└── README.md
```

## 💡 Sample Problem

### Find Even Numbers using Streams

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyDeveloper1
{
    static void main(String[] args)
    {
        List<String> words=Arrays.asList("a","e","i","o","u","Jee",
                "Jeevan","2025Champions","NammaRcb","Kohli");
        List<String> result= words.stream()
                .filter(s->s.length()>3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
```

## 🚀 Learning Outcome

By completing this challenge I aim to:

* Master Java Stream API
* Improve coding consistency
* Write optimized Java code
* Gain confidence for backend interviews
* Improve problem-solving speed

## 🎯 Interview Preparation Focus

This repository helps prepare for:

* Java Backend Developer roles
* Spring Boot Developer roles
* Product company interviews
* Startup hiring rounds
* Service company interviews

## 🔥 Motivation

Daily consistency is the main focus of this challenge.

**5 Problems Daily = Strong Java Stream Skills**

## 🤝 Contribution

Suggestions and improvements are welcome.

## ⭐ Support

If this repository helps you, consider giving a star.

## 👨‍💻 Author

**Java Backend Developer**

* Java
* Spring Boot
* SQL
* Microservices
* DSA
* Java Streams

## 📬 Connect

Feel free to raise an issue for discussion or improvements.

---

**Code • Practice • Improve • Repeat**

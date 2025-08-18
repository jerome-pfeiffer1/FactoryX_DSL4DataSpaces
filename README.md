# DSL4Dataspaces  

A **Domain-Specific Language (DSL)** for describing and enforcing **sovereign data usage policies** in federated data spaces.  

This project provides a DSL that enables **domain experts**—without requiring software engineering expertise—to specify **fine-grained, declarative, and machine-executable data governance requirements**. The DSL integrates with dataspace connectors (e.g., Eclipse Dataspace Connector, IDS connectors) to support **secure, interoperable, and policy-compliant data exchange** in manufacturing and beyond.  

---

## ✨ Motivation  

Federated data spaces such as **GAIA-X**, **International Data Spaces (IDS)**, and **Manufacturing-X** aim to enable:  
- Cross-factory process optimization  
- Predictive maintenance  
- Supplier integration  
- Resilient and sustainable digital supply chains  

Achieving this vision requires:  
1. **Semantic interoperability** via standardized data models  
2. **Sovereign data exchange** across organizations  
3. **Robust internal communication**  

While frameworks such as **AAS**, **Eclipse Dataspace Connector**, **ID-Link**, and **OPC UA** provide a strong technical foundation, they lack practical means for **expressing and enforcing context-dependent data usage policies** in a **human-readable** way.  

The **DSL4Dataspaces** project addresses this gap by providing a **declarative DSL** for defining usage constraints such as:  
- Conditional access control  
- Purpose-bound data sharing  
- Context-aware policies (e.g., restrict access to specific production batches)  

---

## 📂 Project Structure  
```
src/
├─ main/
│ └─ grammars/dsl4dataspaces/DSL4Dataspaces.mc4 # Grammar (abstract + concrete syntax)
│
└─ test/
├─ resources/parser/valid/InnoWindow.dsc # Case study test model (from research paper)
└─ java/dsl4dataspaces/ParserTest.java # Unit test parsing the DSL model

target/ # Generated MontiCore artifacts:
# - Parser
# - AST infrastructure
# - Validator & code generator scaffolding

build.gradle # Gradle build script
```
---

## ⚙️ Technical Requirements  

- **Java JDK 11** (or compatible JVM)  
- **Gradle 7.6**  

---

## 🚀 Build & Run  

Clone the repository and build with Gradle:  

```
bash
git clone <repo-url>
cd dsl4dataspaces
./gradlew build
```

This will:

Generate MontiCore artifacts (parser, AST, validator, codegen infra)

Compile the project

Run the included unit tests

---

## 🧪 Testing

A case study model (InnoWindow.dsc) is provided. To validate parsing and semantics:
```
./gradlew test
```
This runs `ParserTest.java`, which ensures the DSL grammar correctly parses the case study model.
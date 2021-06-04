# ProcessingForKotlinTemplate
A template for doing "Processing" for Kotlin

En | [Ja](./README.ja.md)  

## Usage
### Clone template
```bash
mkdir Your_Project_Name
cd Your_Project_Name
git clone https://github.com/kota-shiokara/ProcessingForKotlinTemplate.git
```

### Edit settings.gradle
```settings.gradle
rootProject.name='Your_Project_Name'
```

### Edit build.gradle
```build.gradle
group 'Your_Group_Name'
```

### Edit src/main/kotlin/main.kt
```kt
class Main : PApplet(){
                .
                .
    override fun setup() {
        /* Write Your Code */
    }

    override fun draw() {
        /* Write Your Code */
    }
                .
                .
```

## Build
```bash
./gradle shadow
```
or
```
gradle shadow
```
**The output file is stored under build/libs/.**

## Run
```bash
java -jar "Output_File_Name"
```

## Author
- [kota-shiokara](https://github.com/kota-shiokara)
- Email: ikanoshiokara.fun@gmail.com
- Twitter: [@shiokara_create](https://twitter.com/shiokara_create)

## About Report
Please use [issue](https://github.com/kota-shiokara/ProcessingForKotlinTemplate/issues) for filing feature requests and bug reports. Or use the contact information above.

## License
[MIT License](https://choosealicense.com/licenses/mit/)

# ProcessingForKotlinTemplate
KotlinでProcessingをやるときのテンプレート  

[En](./README.md)|Ja  

## 使い方
### Clone template
```bash
mkdir Your_Project_Name
cd Your_Project_Name
git clone https://github.com/kota-shiokara/ProcessingForKotlinTemplate.git
```

### settings.gradleの修正
```settings.gradle
rootProject.name='Your_Project_Name'
```

### build.gradleの修正
```build.gradle
group 'Your_Group_Name'
```

### src/main/kotlin/main.ktの追記
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

## ビルド
```bash
./gradle shadow
```
or
```
gradle shadow
```
**出力ファイルはbuild/libs/以下に格納されます。**

## Run
```bash
java -jar "Output_File_Name"
```

## 開発者情報
- [kota-shiokara](https://github.com/kota-shiokara)
- Email: ikanoshiokara.fun@gmail.com
- Twitter: [@shiokara_create](https://twitter.com/shiokara_create)

## 報告
バグの報告、改善の要望につきましては [issue](https://github.com/kota-shiokara/ProcessingForKotlinTemplate/issues) もしくは上記連絡先にお願いします。  

## License
[MIT License](https://choosealicense.com/licenses/mit/)

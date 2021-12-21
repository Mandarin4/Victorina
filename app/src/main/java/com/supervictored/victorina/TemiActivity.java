package com.supervictored.victorina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class TemiActivity extends AppCompatActivity {
    public static  ArrayList<ModelVopr> questions = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temi);
    }
    public void btnTemiAct1(View view){
        Intent intent = new Intent(this, VictorinaActivity.class);
        prepareQuestions1();
        Const.questions = questions;
        startActivity(intent);
        finish();

    }
    public void btnTemiAct2(View view){
        Intent intent = new Intent(this, VictorinaActivity.class);
        prepareQuestions2();
        Const.questions = questions;
        startActivity(intent);
        finish();
    }
    public void btnTemiAct3(View view){
        Intent intent = new Intent(this, VictorinaActivity.class);
        prepareQuestions3();
        Const.questions = questions;
        startActivity(intent);finish();
    }
    public void btnTemiAct4(View view){
        Intent intent = new Intent(this, VictorinaActivity.class);
        prepareQuestions4();
        Const.questions = questions;
        startActivity(intent);finish();
    }
    public void btnTemiAct5(View view){
        Intent intent = new Intent(this, VictorinaActivity.class);
        prepareQuestions5();
        Const.questions = questions;
        startActivity(intent);finish();
    }

    private void prepareQuestions1( ) {
        questions.clear();
        ModelVopr question1 = new ModelVopr();
        question1.vopros = "В каком году главами государств СНГ было подписано Соглашение о создании Межгосударственного экологического совета стран СНГ?";
        question1.otv1 = "1996";
        question1.otv2 = "1995";
        question1.otv3 = "1992";
        question1.pravOtv = 3;
        questions.add(question1);

        ModelVopr question2 = new ModelVopr();
        question2.vopros = "Какое из государств СНГ первым подписало с Европейским Союзом Соглашение о партнёрстве и сотрудничестве?";
        question2.otv1 = "Украина";
        question2.otv2 = "Россия";
        question2.otv3 = "Узбекистан";
        question2.pravOtv = 2;
        questions.add(question2);

        ModelVopr question3 = new ModelVopr();
        question3.vopros = "Какая территория была включена в состав российских владений в Туркестане после 1873 г.?";
        question3.otv1 = "Северное Приаралье";
        question3.otv2 = "Семиречье";
        question3.otv3 = "Правобережье Амударьи";
        question3.pravOtv = 3;
        questions.add(question3);

        ModelVopr question4 = new ModelVopr();
        question4.vopros = "Кто и когда возглавлял первую Российскую императорскую миссию в Бухарское ханство?";
        question4.otv1 = "Негри в 1820 г.";
        question4.otv2 = "Флорио Беневини в 1718 г.";
        question4.otv3 = "Требек в 1820 г.";
        question4.pravOtv = 1;
        questions.add(question4);

        ModelVopr question5 = new ModelVopr();
        question5.vopros = "Закарпатская Украина вошла в состав бывшего СССР согласно ...";
        question5.otv1 = "советско-чехословакскому договору (1945г.)";
        question5.otv2 = "условиям Венского арбитража (1940г.)";
        question5.otv3 = "решению Парижской мирной конференции";
        question5.pravOtv = 1;
        questions.add(question5);

        ModelVopr question6 = new ModelVopr();
        question6.vopros = "По приказу какого правителя отправился Флорио Беневени в Среднюю Азию?";
        question6.otv1 = "Александра I";
        question6.otv2 = "Петра I";
        question6.otv3 = "Николая I";
        question6.pravOtv = 2;
        questions.add(question6);

        ModelVopr question7 = new ModelVopr();
        question7.vopros = "Разгром квантунской армии - основы японских сухопутных сил - был осуществлен Красной Армией в ходе ...";
        question7.otv1 = "60-дневной кампании";
        question7.otv2 = "месячного наступления в Монголии и Китае";
        question7.otv3 = "24-дневной кампании";
        question7.pravOtv = 3;
        questions.add(question7);

        ModelVopr question8 = new ModelVopr();
        question8.vopros = "Кем были построены первые каменные храмы на Руси?";
        question8.otv1 = "итальянскими зодчими";
        question8.otv2 = "византийскими архитекторами";
        question8.otv3 = "Аристотелем Фиорованти";
        question8.pravOtv = 2;
        questions.add(question8);

        ModelVopr question9 = new ModelVopr();
        question9.vopros = "Определите русского путешественника, руководившего кругосветной экспедицией и открывшего 12 островов.";
        question9.otv1 = "Ф.П.Литке";
        question9.otv2 = "М.П.Лазарев";
        question9.otv3 = "Г.И.Невельской";
        question9.pravOtv = 1;
        questions.add(question9);

        ModelVopr question10 = new ModelVopr();
        question10.vopros = "Кто сыграл выдающуюся роль в строительстве укреплений Севастополя?";
        question10.otv1 = "П.Конека";
        question10.otv2 = "Э.И.Тотлебен";
        question10.otv3 = "В.А.Корнилов";
        question10.pravOtv = 1;
        questions.add(question10);

    }

    private void prepareQuestions2( ) {
        questions.clear();
        ModelVopr question1 = new ModelVopr();
        question1.vopros = "Сколько существует основных крупных литосферных плит Земли? ";
        question1.otv1 = "5";
        question1.otv2 = "6";
        question1.otv3 = "7";
        question1.pravOtv = 3;
        questions.add(question1);

        ModelVopr question2 = new ModelVopr();
        question2.vopros = "Какая горная система отделяет Европу от Азии? ";
        question2.otv1 = "Уральские горы";
        question2.otv2 = "Кавказские горы";
        question2.otv3 = "Горы Альпы";
        question2.pravOtv = 1;
        questions.add(question2);

        ModelVopr question3 = new ModelVopr();
        question3.vopros = "Самый низкий от поверхности Земли слой атмосферы – это:";
        question3.otv1 = "тропосфера";
        question3.otv2 = "стратосфера";
        question3.otv3 = "ионосфера";
        question3.pravOtv = 1;
        questions.add(question3);

        ModelVopr question4 = new ModelVopr();
        question4.vopros = "Что является основным источником нагревания атмосферы?";
        question4.otv1 = "солнечные лучи, приходящие непосредственно в атмосферу";
        question4.otv2 = "рассеянная радиация";
        question4.otv3 = "тепловое излучение нагретой земной поверхности";
        question4.pravOtv = 3;
        questions.add(question4);

        ModelVopr question5 = new ModelVopr();
        question5.vopros = "Самый широкий шельф находится в океане";
        question5.otv1 = "Северном Ледовитом";
        question5.otv2 = "Тихом";
        question5.otv3 = "Атлантическом";
        question5.pravOtv = 1;
        questions.add(question5);

        ModelVopr question6 = new ModelVopr();
        question6.vopros = "Определите внутреннее море:";
        question6.otv1 = "Аравийское";
        question6.otv2 = "Средиземное";
        question6.otv3 = "Охотское";
        question6.pravOtv = 2;
        questions.add(question6);

        ModelVopr question7 = new ModelVopr();
        question7.vopros = "Выберите холодное течение в Мировом океане:";
        question7.otv1 = "Гольфстрим";
        question7.otv2 = "Лабрадорское";
        question7.otv3 = "Куросио";
        question7.pravOtv = 2;
        questions.add(question7);

        ModelVopr question8 = new ModelVopr();
        question8.vopros = "Укажите острова, омываемые водами Атлантического океана:";
        question8.otv1 = "Мадагаскар, Тасмания";
        question8.otv2 = "Гренландия, Великобритания";
        question8.otv3 = "Новая Гвинея, Шри-Ланка";
        question8.pravOtv = 2;
        questions.add(question8);

        ModelVopr question9 = new ModelVopr();
        question9.vopros = "Определите вулкан, расположенный в Антарктиде:";
        question9.otv1 = "Котопахи";
        question9.otv2 = "Гекла";
        question9.otv3 = "Эребус";
        question9.pravOtv = 3;
        questions.add(question9);

        ModelVopr question10 = new ModelVopr();
        question10.vopros = "Какие горы расположены на материке Евразия?";
        question10.otv1 = "Аппалачи, Апеннины";
        question10.otv2 = "Атлас, Уральские";
        question10.otv3 = "Памир, Тибет";
        question10.pravOtv = 3;
        questions.add(question10);
    }
    private void prepareQuestions3( ) {
        questions.clear();
        ModelVopr question1 = new ModelVopr();
        question1.vopros = "Из-за нелепой путаницы примерный семьянин стал соучастником преступления, после чего ему пришлось сдаться милиции и стать агентом под прикрытием.";
        question1.otv1 = "Бриллиантовая рука";
        question1.otv2 = "Джентльмены удачи";
        question1.otv3 = "Жених с того света";
        question1.pravOtv = 1;
        questions.add(question1);

        ModelVopr question2 = new ModelVopr();
        question2.vopros = "Герой картины - Робин Гуд XX века. Он отнимает у другого человека нечестно нажитое движимое имущество, продает его, а вырученные деньги пускает на благотворительность. В конце концов гения и филантропа сажают в тюрьму";
        question2.otv1 = "Место встречи изменить нельзя";
        question2.otv2 = "Берегись автомобиля";
        question2.otv3 = "Зигзаг удачи";
        question2.pravOtv = 2;
        questions.add(question2);

        ModelVopr question3 = new ModelVopr();
        question3.vopros = "Гениальный конструктор создаёт устройство, из-за которого его бросает жена. Несмотря на это он знакомится с высокопоставленной особой, которая чуть его не убила.";
        question3.otv1 = "Есть идея!";
        question3.otv2 = "Солярис";
        question3.otv3 = "Иван Васильевич меняет профессию";
        question3.pravOtv = 3;
        questions.add(question3);

        ModelVopr question4 = new ModelVopr();
        question4.vopros = "Случайная встреча в транспорте переворачивает жизнь героев с ног на голову. И даже грязные ботинки этому не помеха!";
        question4.otv1 = "Москва слезам не верит";
        question4.otv2 = "Самая обаятельная и привлекательная";
        question4.otv3 = "Девушка без адреса";
        question4.pravOtv = 1;
        questions.add(question4);

        ModelVopr question5 = new ModelVopr();
        question5.vopros = "Альфа-самец получает отказ от молодой девушки и начинает над ней издеваться. Однако трудностисближают их и дело заканчивается почти свадьбой.";
        question5.otv1 = "Я шагаю по Москве";
        question5.otv2 = "Девчата";
        question5.otv3 = "Неподдающиеся";
        question5.pravOtv = 2;
        questions.add(question5);

        ModelVopr question6 = new ModelVopr();
        question6.vopros = "Из-за пристрастия к алкоголю жизнь мужчины меняется не в лучшую сторону. Всё у него идёт наперекосяк, а тут ещё и депрессия...";
        question6.otv1 = "Любовь и голуби";
        question6.otv2 = "Ирония судьбы, или С лёгким паром!";
        question6.otv3 = "Афоня";
        question6.pravOtv = 3;
        questions.add(question6);

        ModelVopr question7 = new ModelVopr();
        question7.vopros = "Разлученные в детстве братья-близнецы встретились в поединке на замерзшем озере.";
        question7.otv1 = "Джентельмены удачи";
        question7.otv2 = "Приключения электроника";
        question7.otv3 = "Ты – мне, я – тебе";
        question7.pravOtv = 1;
        questions.add(question7);

        ModelVopr question8 = new ModelVopr();
        question8.vopros = "История о двух жуликах и бесплодной погоне за богатством, которая закончилась поножовщиной.";
        question8.otv1 = "Комедия давно минувших дней";
        question8.otv2 = "12 стульев";
        question8.otv3 = "Золотой телёнок";
        question8.pravOtv = 2;
        questions.add(question8);

        ModelVopr question9 = new ModelVopr();
        question9.vopros = "Человек случайно сталкивается с незнакомцем на улице. Встреча ставит под угрозу жизнь и здоровье двух людей.";
        question9.otv1 = "Кавказская пленница, или Новые приключения Шурик";
        question9.otv2 = "Мимино";
        question9.otv3 = "Кин-дза-дза!";
        question9.pravOtv = 3;
        questions.add(question9);

        ModelVopr question10 = new ModelVopr();
        question10.vopros = "Три злоумышленника занимаются нелегальным бизнесом. Дела идут хорошо, но однаждыиз-за собственной глупости они совершают ошибку. Оплошность оборачивается погоней, а хитрых предпринимателей в конце концов ловят.";
        question10.otv1 = "Операция «Ы» и другие приключения Шурика";
        question10.otv2 = "Пёс Барбос и необычный кросс";
        question10.otv3 = "Самогонщики";
        question10.pravOtv = 3;
        questions.add(question10);
    }
    private void prepareQuestions4( ) {
        questions.clear();
        ModelVopr question1 = new ModelVopr();
        question1.vopros = "Следует ли после длительной болезни приступать к разучиванию сложных гимнастических упражнений?";
        question1.otv1 = "Да, в малом темпе.";
        question1.otv2 = "Нет.";
        question1.otv3 = "Да, под присмотром тренера.";
        question1.pravOtv = 2;
        questions.add(question1);

        ModelVopr question2 = new ModelVopr();
        question2.vopros = "Физическая культура представляет собой:";
        question2.otv1 = "Определенную часть культуры человека.";
        question2.otv2 = "Учебную активность.";
        question2.otv3 = "Культуру здорового духа и тела.";
        question2.pravOtv = 1;
        questions.add(question2);

        ModelVopr question3 = new ModelVopr();
        question3.vopros = "Возможности человека, обеспечивающие ему выполнение двигательных действий, называются:";
        question3.otv1 = "Скоростная способность.";
        question3.otv2 = "Двигательный рефлекс.";
        question3.otv3 = "Физическая возможность.";
        question3.pravOtv = 1;
        questions.add(question3);

        ModelVopr question4 = new ModelVopr();
        question4.vopros = "Эффект физических упражнений определяется, прежде всего:";
        question4.otv1 = "Их содержанием.";
        question4.otv2 = "Их формой.";
        question4.otv3 = "Скоростью их выполнения.";
        question4.pravOtv = 1;
        questions.add(question4);

        ModelVopr question5 = new ModelVopr();
        question5.vopros = "Разновидность аэробики, особенностью которой является использование специальной платформы, называется:";
        question5.otv1 = "Боди-балет.";
        question5.otv2 = "Степ-аэробитка.";
        question5.otv3 = "Пилатес.";
        question5.pravOtv = 2;
        questions.add(question5);

        ModelVopr question6 = new ModelVopr();
        question6.vopros = "Сколько подач подряд выполняет один игрок в настольном теннисе?";
        question6.otv1 = "Две.";
        question6.otv2 = "Четыре.";
        question6.otv3 = "Три.";
        question6.pravOtv = 1;
        questions.add(question6);

        ModelVopr question7 = new ModelVopr();
        question7.vopros = "Основные средства защиты из спортивных и восточных единоборств это:";
        question7.otv1 = "Пауэрлифтинг.";
        question7.otv2 = "Бодибилдинг.";
        question7.otv3 = "Атлетическое единоборство.";
        question7.pravOtv = 3;
        questions.add(question7);

        ModelVopr question8 = new ModelVopr();
        question8.vopros = "Какой гимнаст разработал популярную ныне систему тренировок “кроссфит”?";
        question8.otv1 = "Майк Бургенер.";
        question8.otv2 = "Луи Симмонс.";
        question8.otv3 = "В. Грег Глассман.";
        question8.pravOtv = 3;
        questions.add(question8);

        ModelVopr question9 = new ModelVopr();
        question9.vopros = "Одна из форм аэробики, в которой используется специальное покрытие и обувь, называется:";
        question9.otv1 = "Ритмика.";
        question9.otv2 = "Слайд-аэробика.";
        question9.otv3 = "Памп-аэробика.";
        question9.pravOtv = 2;
        questions.add(question9);

        ModelVopr question10 = new ModelVopr();
        question10.vopros = "Как называется одно из новых направлений в фитнесе, сочетающее в себе бокс, танец и пилатес?";
        question10.otv1 = "А. Пилоксинг.";
        question10.otv2 = "Капоэйра.";
        question10.otv3 = "Питабо.";
        question10.pravOtv = 1;
        questions.add(question10);
    }
    private void prepareQuestions5( ) {

        ModelVopr question1 = new ModelVopr();
        question1.vopros = "Сколько ног у насекомых?";
        question1.otv1 = "2";
        question1.otv2 = "4";
        question1.otv3 = "6";
        question1.pravOtv = 2;
        questions.add(question1);

        ModelVopr question2 = new ModelVopr();
        question2.vopros = "Чем покрыто тело рыб?";
        question2.otv1 = "Чешуей";
        question2.otv2 = "Шерстью";
        question2.otv3 = "Перьями ";
        question2.pravOtv = 1;
        questions.add(question2);

        ModelVopr question3 = new ModelVopr();
        question3.vopros = "У каких животных тело покрыто перьями?";
        question3.otv1 = "У рыб";
        question3.otv2 = "У птиц";
        question3.otv3 = "У насекомых ";
        question3.pravOtv = 2;
        questions.add(question3);

        ModelVopr question4 = new ModelVopr();
        question4.vopros = "Как ещё называются звери?";
        question4.otv1 = "Млекопитающие";
        question4.otv2 = "Мясоеды";
        question4.otv3 = "Вегетарианцы ";
        question4.pravOtv = 1;
        questions.add(question4);

        ModelVopr question5 = new ModelVopr();
        question5.vopros = "Чем кормят детёнышей животные?";
        question5.otv1 = "Фруктами";
        question5.otv2 = "Картошкой";
        question5.otv3 = "Молоком";
        question5.pravOtv = 3;
        questions.add(question5);

        ModelVopr question6 = new ModelVopr();
        question6.vopros = "Кто принадлежит к группе земноводных?";
        question6.otv1 = "Лягушки";
        question6.otv2 = "Лисы";
        question6.otv3 = "Окуни ";
        question6.pravOtv = 1;
        questions.add(question6);

        ModelVopr question7 = new ModelVopr();
        question7.vopros = "К какой группе животных принадлежат черепахи, крокодилы и змеи?";
        question7.otv1 = "Земноводные";
        question7.otv2 = "Пресмыкающиеся";
        question7.otv3 = "Рыбы";
        question7.pravOtv = 2;
        questions.add(question7);

        ModelVopr question8 = new ModelVopr();
        question8.vopros = "Где находится орган слуха кузнечика?";
        question8.otv1 = "На голове";
        question8.otv2 = "На животе";
        question8.otv3 = "В ноге";
        question8.pravOtv = 3;
        questions.add(question8);

        ModelVopr question9 = new ModelVopr();
        question9.vopros = "Что спасает птиц от ушибов, царапин, холода и жары?";
        question9.otv1 = "Перья";
        question9.otv2 = "Клюв";
        question9.otv3 = "Лапки";
        question9.pravOtv = 1;
        questions.add(question9);

        ModelVopr question10 = new ModelVopr();
        question10.vopros = "Когда рыба быстро растёт?";
        question10.otv1 = "Летом";
        question10.otv2 = "Зимой";
        question10.otv3 = "Весь год ";
        question10.pravOtv = 1;
        questions.add(question10);
    }
    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        Intent backintent = new Intent(this, MainActivity.class);
        startActivity(backintent);finish();
    }
}
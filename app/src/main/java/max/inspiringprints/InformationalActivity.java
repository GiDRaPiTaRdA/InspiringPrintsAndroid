package max.inspiringprints;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class InformationalActivity extends Activity {

    final String INFO_V = "INFO_V";
    int a;
    SharedPreferences sp;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        sp = getSharedPreferences("settings",MODE_PRIVATE);
        text = (TextView)findViewById(R.id.text);
        text.setMovementMethod(new ScrollingMovementMethod());

        a = sp.getInt(INFO_V,0);
        
        switch (a){
            case 0:text.setText("ERROR");
                break;
            case 1:text.setText("В современном мире визитки играют важную роль, особенно в бизнес-сфере.\n" +
                    "\n" +
                    "Визитки могут быть следующих видов:\n" +
                    "\n" +
                    "- Личные (содержат имя, фамилию и телефон владельца;\n" +
                    " идеально подходят для фрилансеров, а также для неформального общения);\n" +
                    "\n" +
                    "- Деловые (содержат информацию о владельце, его должность,\n" +
                    " название фирмы и виды услуг; используются в бизнесе,\n" +
                    " на официальных встречах, переговорах)\n" +
                    "\n" +
                    "- Корпоративные (содержат информацию о компании и\n носят рекламный характер).\n" +
                    "\n" +
                    "Какой бы вид визиток вы не выбрали, требования к\n" +
                    " ним одинаковые: высокое качество, хороший дизайн и\n" +
                    " привлекательный внешний вид в целом.\n" +
                    "Мы печатаем визитки в современной типографии на\n" +
                    " профессиональном оборудовании. Мы используем плотный матовый \n" +
                    "картон и технологию износостойкого печати, благодаря которому\n" +
                    "изображение на визитке держится достаточно долго. \n" +
                    "Также наши визитки имеют влагостойкие свойства \n" +
                    "(при попадании воды на визитку с изображением ничего не случится).");
                break;
            case 2:text.setText("Если вы ищете оригинальный и одновременно полезный подарок, тогда фотосувениров чашка - именно то, что надо!\n" +
                    "\n" +
                    "Чашка с фотографией - это уникальный, яркий и приятный подарок.\n" +
                    "\n" +
                    "К тому же, эти фотосувениры можно свободно использовать в быту, ведь печать на чашках гарантирует" +
                    ", что изображение надежно отражается на поверхности.\n" +
                    "\n" +
                    "«Скорая Фотка» заботится о своих клиентах, поэтому, выбирая фотосувениров чашка с фотографией, " +
                    "вы можете быть уверены в его высоком качестве и безопасности изделия.\n" +
                    "\n" +
                    "Также мы предлагаем широкий выбор чашек для нанесения изображения: белые чашки, чашки хамелеон, " +
                    "или магические (меняют цвет при наливании горячей воды), чашки цветные (цветная внутренняя поверхность и ручка).");
                break;
            case 3:text.setText("Одним из самых эффективных средств быстрой и массовой рекламы является флаер.\n" +
                    "\n" +
                    "Флаер - это небольшая рекламная листовка, содержащая информацию об акциях, скидках, концерты или " +
                    "другие мероприятия, справочные данные, а также используется в качестве приглашения. Основная задача " +
                    "флаера - быстро и понятно донести информацию до потенциального покупателя или участника.\n" +
                    "\n" +
                    "Если вы ищете печать флаеров, тогда ваш выбор - «Скорая Фотка». Мы предлагаем изготовление флаеров на" +
                    " профессиональном оборудовании с использованием качественных материалов. Также, в случае необходимости, " +
                    "наши дизайнеры помогут вам разработать макет флаера.\n" +
                    "\n" +
                    "В готовом виде еврофлаер имеет размеры 210х100 мм (1/3 А4).");
                break;
            case 4:text.setText("Плакаты - это вид полиграфической продукции рекламного, информационного или учебного характера." +
                    " Основные требования к плакату следующие: легко воспринимается на большом расстоянии и является заметным среди прочей визуальной продукции.\n" +
                    "\n" +
                    "Информация, размещенная на плакате, может быть различной: реклама фирмы, агентства или студии, политическая или" +
                    " социальная реклама, сведения о выставке, концерт или любой другой запах.\n" +
                    "\n" +
                    "Также плакаты будут полезными компаниям при подготовке презентаций, корпоративных мероприятий. В таком случае" +
                    " на плакатах можно разместить диаграммы, схемы и т.\n" +
                    "\n" +
                    "Также мы предлагаем изготовление такого результативного вида наружной рекламы, как ситилайт.");
                break;
            case 5:text.setText("Одним из самых интересных и оригинальных подарков может стать пазл с фотографией.\n" +
                    "\n" +
                    "Пазл - это игра-головоломка, состоящая из большого количества фрагментов одного изображения. Эта" +
                    " головоломка является доступным и интересным способом тренировать память, развивать внимание, воображение," +
                    " логическое мышление, наблюдательность, познавательные способности.\n" +
                    "\n" +
                    "Печать на пазлах будет подарком, уместным любому поводу: ребенку или взрослому, имениннику, молодоженам, родным, друзьям или коллегам.\n" +
                    "\n" +
                    "«Скорая Фотка» предлагает широкий выбор фотопазлов: Стандарт и Магнитные форматов А4 (150 фрагментов), А3 (300 фрагментов), А2 (600 фрагментов).\n" +
                    "\n" +
                    "Готовый фотопазл упаковывается в картонную коробку с большой фотографией.");
                break;
            case 6:text.setText("В эпоху масс-маркет каждый шанс проявить свою индивидуальность - бесценен. Одним из таких " +
                    "способов был и остается одежду. С помощью одежды можно показать не только свое собственное чувство стиля, " +
                    "а и мировоззрение, гражданскую позицию, командную или корпоративную культуру и тому подобное.\n" +
                    "\n" +
                    "Хороший способ индивидуализации одежды является печать на футболках. Также футболка с принтом может стать " +
                    "оригинальным подарком.\n" +
                    "\n" +
                    "Нанести уникальный принт на футболку, которая будет в единственном экземпляре, или заказать целую партию таких " +
                    "футболок можно в «Скорой фотке».\n" +
                    "\n" +
                    "Мы предлагаем высококачественную печать на футболках бельгийской фирмы B & C, которая лучше всего" +
                    " зарекомендовала себя в соотношении цены и качества. В наличии мужские и женские футболки белого и черного цветов, все размеры.\n" +
                    "\n" +
                    " Срок изготовления 3 дня\n" +
                    "\n" +
                    "Уход за футболками с принтом\n" +
                    "\n" +
                    "Печать на футболках, виготовленх в «Скорой фотке», достаточно устойчив. Впрочем, чтобы изображение" +
                    " можно дольше держало исходное качество и яркость, мы рекомендуем стирать футболки вручную или в стиральной " +
                    "машинке в режиме деликатной стирки при температуре воды не более 40 С. Нельзя использовать отбеливатель или" +
                    " кипятить футболку. Гладить футболку с фотографией или принтом следует с внутренней стороны или через ткань.");
                break;

        }

    }


}

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.time.LocalDate;

/**
 * @author 倦鸟
 */
public class ModelMapperTest {


    @Test
    public void testConvert() {


        MemberDO memberDO = new MemberDO();
        memberDO.setName("john");
        memberDO.setAge(0);
        memberDO.setBirthday(LocalDate.now());

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setSkipNullEnabled(true);
        /*
        modelMapper.typeMap(MemberDO.class, MemberDTO.class)
                .addMapping(MemberDO::getAge, MemberDTO::setMemberAge);
        */
        modelMapper.typeMap(MemberDO.class, MemberDTO.class)
                .addMappings(mapper -> {
                            mapper.map(MemberDO::getName, MemberDTO::setMemberName);
                            mapper.map(MemberDO::getAge, MemberDTO::setMemberAge);
                        }
                );

        MemberDTO memberDTO = modelMapper.map(memberDO, MemberDTO.class);
        Assert.assertThat(memberDTO.getMemberAge(), CoreMatchers.equalTo(memberDO.getAge()));
        Assert.assertThat(memberDTO.getMemberName(), CoreMatchers.equalTo(memberDO.getName()));
    }
}

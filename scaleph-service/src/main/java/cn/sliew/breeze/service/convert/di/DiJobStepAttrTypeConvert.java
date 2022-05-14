package cn.sliew.breeze.service.convert.di;

import cn.sliew.breeze.dao.entity.master.di.DiJobStepAttrType;
import cn.sliew.breeze.service.convert.BaseConvert;
import cn.sliew.breeze.service.dto.di.DiJobStepAttrTypeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @author gleiyu
 */
@Mapper(uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DiJobStepAttrTypeConvert extends BaseConvert<DiJobStepAttrType, DiJobStepAttrTypeDTO> {
    DiJobStepAttrTypeConvert INSTANCE = Mappers.getMapper(DiJobStepAttrTypeConvert.class);

}

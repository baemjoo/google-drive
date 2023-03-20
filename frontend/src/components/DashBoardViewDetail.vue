<template>

    <v-card outlined>
        <v-card-title>
            DashBoard # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Filename" v-model="item.filename" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Filesize" v-model="item.filesize" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Filepath" v-model="item.filepath" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Filetype" v-model="item.filetype" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="IndexYn" v-model="item.indexYn" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="UploadYn" v-model="item.uploadYn" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Videourl" v-model="item.videourl" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'DashBoardViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/dashBoards/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>


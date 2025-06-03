.class public final LO1/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO1/r$b;,
        LO1/r$a;
    }
.end annotation


# static fields
.field public static final w:LO1/r$a;


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:I

.field public final e:Ljava/util/EnumSet;

.field public final f:Ljava/util/Map;

.field public final g:Z

.field public final h:LO1/j;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Z

.field public final l:Z

.field public final m:Lorg/json/JSONArray;

.field public final n:Ljava/lang/String;

.field public final o:Z

.field public final p:Z

.field public final q:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;

.field public final t:Lorg/json/JSONArray;

.field public final u:Lorg/json/JSONArray;

.field public final v:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LO1/r$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LO1/r$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LO1/r;->w:LO1/r$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;ZILjava/util/EnumSet;Ljava/util/Map;ZLO1/j;Ljava/lang/String;Ljava/lang/String;ZZLorg/json/JSONArray;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/util/Map;)V
    .locals 9

    .line 1
    move-object v0, p0

    move-object v1, p2

    move-object v2, p5

    move-object v3, p6

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    move-object/from16 v7, p14

    const-string v8, "nuxContent"

    invoke-static {p2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "smartLoginOptions"

    invoke-static {p5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "dialogConfigurations"

    invoke-static {p6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "errorClassification"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "smartLoginBookmarkIconURL"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "smartLoginMenuIconURL"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "sdkUpdateMessage"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v8, p1

    iput-boolean v8, v0, LO1/r;->a:Z

    iput-object v1, v0, LO1/r;->b:Ljava/lang/String;

    move v1, p3

    iput-boolean v1, v0, LO1/r;->c:Z

    move v1, p4

    iput v1, v0, LO1/r;->d:I

    iput-object v2, v0, LO1/r;->e:Ljava/util/EnumSet;

    iput-object v3, v0, LO1/r;->f:Ljava/util/Map;

    move/from16 v1, p7

    iput-boolean v1, v0, LO1/r;->g:Z

    iput-object v4, v0, LO1/r;->h:LO1/j;

    iput-object v5, v0, LO1/r;->i:Ljava/lang/String;

    iput-object v6, v0, LO1/r;->j:Ljava/lang/String;

    move/from16 v1, p11

    iput-boolean v1, v0, LO1/r;->k:Z

    move/from16 v1, p12

    iput-boolean v1, v0, LO1/r;->l:Z

    move-object/from16 v1, p13

    iput-object v1, v0, LO1/r;->m:Lorg/json/JSONArray;

    iput-object v7, v0, LO1/r;->n:Ljava/lang/String;

    move/from16 v1, p15

    iput-boolean v1, v0, LO1/r;->o:Z

    move/from16 v1, p16

    iput-boolean v1, v0, LO1/r;->p:Z

    move-object/from16 v1, p17

    iput-object v1, v0, LO1/r;->q:Ljava/lang/String;

    move-object/from16 v1, p18

    iput-object v1, v0, LO1/r;->r:Ljava/lang/String;

    move-object/from16 v1, p19

    iput-object v1, v0, LO1/r;->s:Ljava/lang/String;

    move-object/from16 v1, p20

    iput-object v1, v0, LO1/r;->t:Lorg/json/JSONArray;

    move-object/from16 v1, p21

    iput-object v1, v0, LO1/r;->u:Lorg/json/JSONArray;

    move-object/from16 v1, p22

    iput-object v1, v0, LO1/r;->v:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO1/r;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO1/r;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()LO1/j;
    .locals 1

    .line 1
    iget-object v0, p0, LO1/r;->h:LO1/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lorg/json/JSONArray;
    .locals 1

    .line 1
    iget-object v0, p0, LO1/r;->m:Lorg/json/JSONArray;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO1/r;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public final f()Lorg/json/JSONArray;
    .locals 1

    .line 1
    iget-object v0, p0, LO1/r;->u:Lorg/json/JSONArray;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lorg/json/JSONArray;
    .locals 1

    .line 1
    iget-object v0, p0, LO1/r;->t:Lorg/json/JSONArray;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LO1/r;->q:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LO1/r;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LO1/r;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, LO1/r;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final l()Ljava/util/EnumSet;
    .locals 1

    .line 1
    iget-object v0, p0, LO1/r;->e:Ljava/util/EnumSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LO1/r;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO1/r;->a:Z

    .line 2
    .line 3
    return v0
.end method

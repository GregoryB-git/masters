.class public final LA1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA1/e$c;,
        LA1/e$b;,
        LA1/e$a;,
        LA1/e$d;,
        LA1/e$e;
    }
.end annotation


# static fields
.field public static final a:LA1/e;

.field public static final b:Ljava/util/Map;

.field public static final c:Ljava/util/Map;

.field public static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 25

    .line 1
    new-instance v0, LA1/e;

    invoke-direct {v0}, LA1/e;-><init>()V

    sput-object v0, LA1/e;->a:LA1/e;

    sget-object v0, LA1/b;->q:LA1/b;

    new-instance v1, LA1/e$c;

    sget-object v2, LA1/k;->p:LA1/k;

    sget-object v3, LA1/l;->p:LA1/l;

    invoke-direct {v1, v2, v3}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v0, v1}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v0

    sget-object v1, LA1/b;->r:LA1/b;

    new-instance v3, LA1/e$c;

    sget-object v4, LA1/l;->q:LA1/l;

    invoke-direct {v3, v2, v4}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v1, v3}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v1

    sget-object v3, LA1/b;->s:LA1/b;

    new-instance v4, LA1/e$c;

    sget-object v5, LA1/l;->r:LA1/l;

    invoke-direct {v4, v2, v5}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v3, v4}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v3

    sget-object v4, LA1/b;->t:LA1/b;

    new-instance v5, LA1/e$c;

    sget-object v6, LA1/l;->s:LA1/l;

    invoke-direct {v5, v2, v6}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v4, v5}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v4

    sget-object v5, LA1/b;->u:LA1/b;

    new-instance v6, LA1/e$c;

    sget-object v7, LA1/l;->t:LA1/l;

    invoke-direct {v6, v2, v7}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v5, v6}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v5

    sget-object v6, LA1/b;->w:LA1/b;

    new-instance v7, LA1/e$c;

    sget-object v8, LA1/k;->q:LA1/k;

    sget-object v9, LA1/l;->v:LA1/l;

    invoke-direct {v7, v8, v9}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v6, v7}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v6

    sget-object v7, LA1/b;->x:LA1/b;

    new-instance v9, LA1/e$c;

    sget-object v10, LA1/l;->w:LA1/l;

    invoke-direct {v9, v8, v10}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v7, v9}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v7

    sget-object v9, LA1/b;->y:LA1/b;

    new-instance v10, LA1/e$c;

    sget-object v11, LA1/l;->x:LA1/l;

    invoke-direct {v10, v8, v11}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v9, v10}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v9

    sget-object v10, LA1/b;->z:LA1/b;

    new-instance v11, LA1/e$c;

    sget-object v12, LA1/l;->y:LA1/l;

    invoke-direct {v11, v8, v12}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v10, v11}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v10

    sget-object v11, LA1/b;->A:LA1/b;

    new-instance v12, LA1/e$c;

    sget-object v13, LA1/l;->z:LA1/l;

    invoke-direct {v12, v8, v13}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v11, v12}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v11

    sget-object v12, LA1/b;->B:LA1/b;

    new-instance v13, LA1/e$c;

    sget-object v14, LA1/l;->A:LA1/l;

    invoke-direct {v13, v8, v14}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v12, v13}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v12

    sget-object v13, LA1/b;->C:LA1/b;

    new-instance v14, LA1/e$c;

    sget-object v15, LA1/l;->B:LA1/l;

    invoke-direct {v14, v8, v15}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v13, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v13

    sget-object v14, LA1/b;->D:LA1/b;

    new-instance v15, LA1/e$c;

    move-object/from16 v16, v13

    sget-object v13, LA1/l;->C:LA1/l;

    invoke-direct {v15, v8, v13}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v14, v15}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v13

    sget-object v14, LA1/b;->E:LA1/b;

    new-instance v15, LA1/e$c;

    move-object/from16 v17, v13

    sget-object v13, LA1/l;->D:LA1/l;

    invoke-direct {v15, v8, v13}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v14, v15}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v13

    sget-object v14, LA1/b;->F:LA1/b;

    new-instance v15, LA1/e$c;

    move-object/from16 v18, v13

    sget-object v13, LA1/l;->E:LA1/l;

    invoke-direct {v15, v8, v13}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v14, v15}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v13

    sget-object v14, LA1/b;->G:LA1/b;

    new-instance v15, LA1/e$c;

    move-object/from16 v19, v13

    sget-object v13, LA1/l;->F:LA1/l;

    invoke-direct {v15, v8, v13}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v14, v15}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v8

    sget-object v13, LA1/b;->v:LA1/b;

    new-instance v14, LA1/e$c;

    const/4 v15, 0x0

    invoke-direct {v14, v2, v15}, LA1/e$c;-><init>(LA1/k;LA1/l;)V

    invoke-static {v13, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v2

    const/16 v13, 0x11

    new-array v14, v13, [LV5/m;

    const/16 v20, 0x0

    aput-object v0, v14, v20

    const/4 v0, 0x1

    aput-object v1, v14, v0

    const/4 v1, 0x2

    aput-object v3, v14, v1

    const/4 v3, 0x3

    aput-object v4, v14, v3

    const/4 v4, 0x4

    aput-object v5, v14, v4

    const/4 v5, 0x5

    aput-object v6, v14, v5

    const/4 v6, 0x6

    aput-object v7, v14, v6

    const/4 v7, 0x7

    aput-object v9, v14, v7

    const/16 v9, 0x8

    aput-object v10, v14, v9

    const/16 v10, 0x9

    aput-object v11, v14, v10

    const/16 v11, 0xa

    aput-object v12, v14, v11

    const/16 v12, 0xb

    aput-object v16, v14, v12

    const/16 v16, 0xc

    aput-object v17, v14, v16

    const/16 v17, 0xd

    aput-object v18, v14, v17

    const/16 v12, 0xe

    aput-object v19, v14, v12

    const/16 v19, 0xf

    aput-object v8, v14, v19

    const/16 v8, 0x10

    aput-object v2, v14, v8

    invoke-static {v14}, LW5/C;->f([LV5/m;)Ljava/util/Map;

    move-result-object v2

    sput-object v2, LA1/e;->b:Ljava/util/Map;

    sget-object v2, LA1/m;->q:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v8, LA1/i;->q:LA1/i;

    invoke-direct {v14, v15, v8}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v2, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v2

    sget-object v8, LA1/m;->r:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v12, LA1/i;->r:LA1/i;

    invoke-direct {v14, v15, v12}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v8, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v8

    sget-object v12, LA1/m;->s:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v15, LA1/k;->r:LA1/k;

    sget-object v11, LA1/i;->p:LA1/i;

    invoke-direct {v14, v15, v11}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v12, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v11

    sget-object v12, LA1/m;->t:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v10, LA1/i;->s:LA1/i;

    invoke-direct {v14, v15, v10}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v12, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v10

    sget-object v12, LA1/m;->u:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v9, LA1/i;->t:LA1/i;

    invoke-direct {v14, v15, v9}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v12, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v9

    sget-object v12, LA1/m;->v:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v7, LA1/i;->u:LA1/i;

    invoke-direct {v14, v15, v7}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v12, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v7

    sget-object v12, LA1/m;->G:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v6, LA1/i;->F:LA1/i;

    invoke-direct {v14, v15, v6}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v12, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v6

    sget-object v12, LA1/m;->w:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v5, LA1/i;->v:LA1/i;

    invoke-direct {v14, v15, v5}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v12, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v5

    sget-object v12, LA1/m;->x:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v4, LA1/i;->w:LA1/i;

    invoke-direct {v14, v15, v4}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v12, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v4

    sget-object v12, LA1/m;->y:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v3, LA1/i;->x:LA1/i;

    invoke-direct {v14, v15, v3}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v12, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v3

    sget-object v12, LA1/m;->z:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v1, LA1/i;->y:LA1/i;

    invoke-direct {v14, v15, v1}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v12, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v1

    sget-object v12, LA1/m;->A:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v0, LA1/i;->z:LA1/i;

    invoke-direct {v14, v15, v0}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v12, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v0

    sget-object v12, LA1/m;->B:LA1/m;

    new-instance v14, LA1/e$b;

    sget-object v13, LA1/i;->A:LA1/i;

    invoke-direct {v14, v15, v13}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v12, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v12

    sget-object v13, LA1/m;->C:LA1/m;

    new-instance v14, LA1/e$b;

    move-object/from16 v21, v12

    sget-object v12, LA1/i;->B:LA1/i;

    invoke-direct {v14, v15, v12}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v13, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v12

    sget-object v13, LA1/m;->D:LA1/m;

    new-instance v14, LA1/e$b;

    move-object/from16 v22, v12

    sget-object v12, LA1/i;->C:LA1/i;

    invoke-direct {v14, v15, v12}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v13, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v12

    sget-object v13, LA1/m;->E:LA1/m;

    new-instance v14, LA1/e$b;

    move-object/from16 v23, v12

    sget-object v12, LA1/i;->D:LA1/i;

    invoke-direct {v14, v15, v12}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v13, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v12

    sget-object v13, LA1/m;->F:LA1/m;

    new-instance v14, LA1/e$b;

    move-object/from16 v24, v12

    sget-object v12, LA1/i;->E:LA1/i;

    invoke-direct {v14, v15, v12}, LA1/e$b;-><init>(LA1/k;LA1/i;)V

    invoke-static {v13, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v12

    const/16 v13, 0x11

    new-array v13, v13, [LV5/m;

    aput-object v2, v13, v20

    const/4 v2, 0x1

    aput-object v8, v13, v2

    const/4 v2, 0x2

    aput-object v11, v13, v2

    const/4 v2, 0x3

    aput-object v10, v13, v2

    const/4 v2, 0x4

    aput-object v9, v13, v2

    const/4 v2, 0x5

    aput-object v7, v13, v2

    const/4 v2, 0x6

    aput-object v6, v13, v2

    const/4 v2, 0x7

    aput-object v5, v13, v2

    const/16 v2, 0x8

    aput-object v4, v13, v2

    const/16 v2, 0x9

    aput-object v3, v13, v2

    const/16 v2, 0xa

    aput-object v1, v13, v2

    const/16 v1, 0xb

    aput-object v0, v13, v1

    aput-object v21, v13, v16

    aput-object v22, v13, v17

    const/16 v0, 0xe

    aput-object v23, v13, v0

    aput-object v24, v13, v19

    const/16 v0, 0x10

    aput-object v12, v13, v0

    invoke-static {v13}, LW5/C;->f([LV5/m;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LA1/e;->c:Ljava/util/Map;

    const-string v0, "fb_mobile_achievement_unlocked"

    sget-object v1, LA1/j;->p:LA1/j;

    invoke-static {v0, v1}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v0

    const-string v1, "fb_mobile_activate_app"

    sget-object v2, LA1/j;->q:LA1/j;

    invoke-static {v1, v2}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v1

    const-string v2, "fb_mobile_add_payment_info"

    sget-object v3, LA1/j;->r:LA1/j;

    invoke-static {v2, v3}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v2

    const-string v3, "fb_mobile_add_to_cart"

    sget-object v4, LA1/j;->s:LA1/j;

    invoke-static {v3, v4}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v3

    const-string v4, "fb_mobile_add_to_wishlist"

    sget-object v5, LA1/j;->t:LA1/j;

    invoke-static {v4, v5}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v4

    const-string v5, "fb_mobile_complete_registration"

    sget-object v6, LA1/j;->u:LA1/j;

    invoke-static {v5, v6}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v5

    const-string v6, "fb_mobile_content_view"

    sget-object v7, LA1/j;->v:LA1/j;

    invoke-static {v6, v7}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v6

    const-string v7, "fb_mobile_initiated_checkout"

    sget-object v8, LA1/j;->w:LA1/j;

    invoke-static {v7, v8}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v7

    const-string v8, "fb_mobile_level_achieved"

    sget-object v9, LA1/j;->x:LA1/j;

    invoke-static {v8, v9}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v8

    const-string v9, "fb_mobile_purchase"

    sget-object v10, LA1/j;->y:LA1/j;

    invoke-static {v9, v10}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v9

    const-string v10, "fb_mobile_rate"

    sget-object v11, LA1/j;->z:LA1/j;

    invoke-static {v10, v11}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v10

    const-string v11, "fb_mobile_search"

    sget-object v12, LA1/j;->A:LA1/j;

    invoke-static {v11, v12}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v11

    const-string v12, "fb_mobile_spent_credits"

    sget-object v13, LA1/j;->B:LA1/j;

    invoke-static {v12, v13}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v12

    const-string v13, "fb_mobile_tutorial_completion"

    sget-object v14, LA1/j;->C:LA1/j;

    invoke-static {v13, v14}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object v13

    const/16 v14, 0xe

    new-array v14, v14, [LV5/m;

    aput-object v0, v14, v20

    const/4 v0, 0x1

    aput-object v1, v14, v0

    const/4 v0, 0x2

    aput-object v2, v14, v0

    const/4 v0, 0x3

    aput-object v3, v14, v0

    const/4 v0, 0x4

    aput-object v4, v14, v0

    const/4 v0, 0x5

    aput-object v5, v14, v0

    const/4 v0, 0x6

    aput-object v6, v14, v0

    const/4 v0, 0x7

    aput-object v7, v14, v0

    const/16 v0, 0x8

    aput-object v8, v14, v0

    const/16 v0, 0x9

    aput-object v9, v14, v0

    const/16 v0, 0xa

    aput-object v10, v14, v0

    const/16 v0, 0xb

    aput-object v11, v14, v0

    aput-object v12, v14, v16

    aput-object v13, v14, v17

    invoke-static {v14}, LW5/C;->f([LV5/m;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LA1/e;->d:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final k(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 13

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "AppEventsConversionsAPITransformer"

    const-string v3, "appEvents"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    :try_start_0
    sget-object v5, LO1/P;->a:LO1/P;

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, LO1/P;->m(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    sget-object v7, LO1/P;->a:LO1/P;

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, LO1/P;->n(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    goto/16 :goto_5

    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    return-object v4

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    sget-object v9, LA1/m;->p:LA1/m$a;

    invoke-virtual {v9, v8}, LA1/m$a;->a(Ljava/lang/String;)LA1/m;

    move-result-object v9

    sget-object v10, LA1/e;->c:Ljava/util/Map;

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LA1/e$b;

    if-eqz v9, :cond_2

    if-nez v10, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v10}, LA1/e$b;->b()LA1/k;

    move-result-object v11

    const-string v12, "null cannot be cast to non-null type kotlin.Any"

    if-eqz v11, :cond_6

    sget-object v9, LA1/k;->r:LA1/k;

    if-ne v11, v9, :cond_2

    invoke-virtual {v10}, LA1/e$b;->a()LA1/i;

    move-result-object v9

    invoke-virtual {v9}, LA1/i;->e()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-static {v8, v10}, LA1/e;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-interface {v5, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :try_start_1
    invoke-virtual {v10}, LA1/e$b;->a()LA1/i;

    move-result-object v10

    invoke-virtual {v10}, LA1/i;->e()Ljava/lang/String;

    move-result-object v10

    sget-object v11, LA1/m;->r:LA1/m;

    if-ne v9, v11, :cond_8

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_8

    sget-object v9, LA1/e;->a:LA1/e;

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_7

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v9, v8}, LA1/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    :goto_3
    invoke-interface {v6, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :catch_1
    move-exception v8

    goto :goto_4

    :cond_7
    new-instance v8, Ljava/lang/NullPointerException;

    const-string v9, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {v8, v9}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v8

    :cond_8
    sget-object v11, LA1/m;->q:LA1/m;

    if-ne v9, v11, :cond_2

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    if-eqz v9, :cond_2

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_a

    invoke-static {v8, v9}, LA1/e;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_9

    goto :goto_3

    :cond_9
    new-instance v8, Ljava/lang/NullPointerException;

    invoke-direct {v8, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v8

    :cond_a
    new-instance v8, Ljava/lang/NullPointerException;

    invoke-direct {v8, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_4
    sget-object v9, LO1/C;->e:LO1/C$a;

    sget-object v10, Lx1/N;->s:Lx1/N;

    invoke-static {v8}, LV5/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v8

    new-array v11, v1, [Ljava/lang/Object;

    aput-object v8, v11, v0

    const-string v8, "\n transformEvents ClassCastException: \n %s "

    invoke-virtual {v9, v10, v2, v8, v11}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_b
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v1

    if-eqz v4, :cond_c

    sget-object v4, LA1/k;->r:LA1/k;

    invoke-virtual {v4}, LA1/k;->e()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_d
    return-object p0

    :goto_5
    sget-object v5, LO1/C;->e:LO1/C$a;

    sget-object v6, Lx1/N;->s:Lx1/N;

    const-string v7, "\n transformEvents JSONException: \n%s\n%s"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    aput-object p0, v8, v0

    aput-object v3, v8, v1

    invoke-virtual {v5, v6, v2, v7, v8}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4
.end method

.method public static final l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const-string v3, "field"

    .line 5
    .line 6
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v3, "value"

    .line 10
    .line 11
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v3, LA1/e$d;->o:LA1/e$d$a;

    .line 15
    .line 16
    invoke-virtual {v3, p0}, LA1/e$d$a;->a(Ljava/lang/String;)LA1/e$d;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of v3, p1, Ljava/lang/String;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    move-object v3, p1

    .line 26
    check-cast v3, Ljava/lang/String;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v3, v4

    .line 30
    :goto_0
    if-eqz p0, :cond_8

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_1
    sget-object v5, LA1/e$e;->a:[I

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    aget p0, v5, p0

    .line 43
    .line 44
    if-eq p0, v2, :cond_6

    .line 45
    .line 46
    if-eq p0, v1, :cond_3

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    if-ne p0, v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lkotlin/text/i;->f(Ljava/lang/String;)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_2
    new-instance p0, LV5/l;

    .line 61
    .line 62
    invoke-direct {p0}, LV5/l;-><init>()V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_3
    invoke-static {v3}, Lkotlin/text/i;->f(Ljava/lang/String;)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    move v0, v2

    .line 79
    :cond_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    :cond_5
    return-object v4

    .line 84
    :cond_6
    :try_start_0
    sget-object p0, LO1/P;->a:LO1/P;

    .line 85
    .line 86
    new-instance p0, Lorg/json/JSONArray;

    .line 87
    .line 88
    invoke-direct {p0, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {p0}, LO1/P;->m(Lorg/json/JSONArray;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    new-instance v3, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    check-cast p0, Ljava/lang/Iterable;

    .line 101
    .line 102
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_7

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    check-cast v4, Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2

    .line 117
    .line 118
    :try_start_1
    sget-object v5, LO1/P;->a:LO1/P;

    .line 119
    .line 120
    new-instance v5, Lorg/json/JSONObject;

    .line 121
    .line 122
    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v5}, LO1/P;->n(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object v4
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 129
    goto :goto_2

    .line 130
    :catch_0
    :try_start_2
    sget-object v5, LO1/P;->a:LO1/P;

    .line 131
    .line 132
    new-instance v5, Lorg/json/JSONArray;

    .line 133
    .line 134
    invoke-direct {v5, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v5}, LO1/P;->m(Lorg/json/JSONArray;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v4
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 141
    :catch_1
    :goto_2
    :try_start_3
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :catch_2
    move-exception p0

    .line 146
    goto :goto_3

    .line 147
    :cond_7
    return-object v3

    .line 148
    :goto_3
    sget-object v3, LO1/C;->e:LO1/C$a;

    .line 149
    .line 150
    sget-object v4, Lx1/N;->s:Lx1/N;

    .line 151
    .line 152
    const-string v5, "\n transformEvents JSONException: \n%s\n%s"

    .line 153
    .line 154
    new-array v1, v1, [Ljava/lang/Object;

    .line 155
    .line 156
    aput-object p1, v1, v0

    .line 157
    .line 158
    aput-object p0, v1, v2

    .line 159
    .line 160
    const-string p0, "AppEventsConversionsAPITransformer"

    .line 161
    .line 162
    invoke-virtual {v3, v4, p0, v5, v1}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget-object p0, LV5/t;->a:LV5/t;

    .line 166
    .line 167
    return-object p0

    .line 168
    :cond_8
    :goto_4
    return-object p1
.end method


# virtual methods
.method public final a(LA1/a;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "eventType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userData"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "appData"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "restOfData"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "customEvents"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2, p3, p4}, LA1/e;->d(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    sget-object p3, LA1/e$e;->c:[I

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    aget p1, p3, p1

    .line 37
    .line 38
    const/4 p3, 0x1

    .line 39
    if-eq p1, p3, :cond_1

    .line 40
    .line 41
    const/4 p3, 0x2

    .line 42
    if-eq p1, p3, :cond_0

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, p2, p5}, LA1/e;->b(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {p0, p2, p6}, LA1/e;->c(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    return-object p1
.end method

.method public final b(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    check-cast p2, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/util/Map;

    .line 31
    .line 32
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-interface {v2, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v2, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-object v0
.end method

.method public final c(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, LA1/i;->r:LA1/i;

    .line 14
    .line 15
    invoke-virtual {p1}, LA1/i;->e()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v1, LA1/n;->s:LA1/n;

    .line 20
    .line 21
    invoke-virtual {v1}, LA1/n;->e()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p1, LA1/i;->q:LA1/i;

    .line 29
    .line 30
    invoke-virtual {p1}, LA1/i;->e()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, LW5/m;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method public final d(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    .locals 3

    .line 1
    const-string v0, "userData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appData"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "restOfData"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v1, LA1/n;->q:LA1/n;

    .line 22
    .line 23
    invoke-virtual {v1}, LA1/n;->e()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, LA1/n;->r:LA1/n;

    .line 28
    .line 29
    invoke-virtual {v2}, LA1/n;->e()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sget-object v1, LA1/k;->p:LA1/k;

    .line 37
    .line 38
    invoke-virtual {v1}, LA1/k;->e()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    sget-object p1, LA1/k;->q:LA1/k;

    .line 46
    .line 47
    invoke-virtual {p1}, LA1/k;->e()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, p3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public final e(Ljava/util/Map;)Ljava/util/List;
    .locals 10

    .line 1
    const-string v0, "parameters"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v8, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    move-object v1, p0

    .line 27
    move-object v2, p1

    .line 28
    move-object v3, v0

    .line 29
    move-object v4, v7

    .line 30
    move-object v5, v8

    .line 31
    move-object v6, v9

    .line 32
    invoke-virtual/range {v1 .. v6}, LA1/e;->f(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;)LA1/a;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    sget-object v1, LA1/a;->r:LA1/a;

    .line 37
    .line 38
    if-ne v2, v1, :cond_0

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    return-object p1

    .line 42
    :cond_0
    sget-object v1, LA1/n;->t:LA1/n;

    .line 43
    .line 44
    invoke-virtual {v1}, LA1/n;->e()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    move-object v1, p0

    .line 53
    move-object v3, v0

    .line 54
    move-object v4, v7

    .line 55
    move-object v5, v9

    .line 56
    move-object v6, v8

    .line 57
    move-object v7, p1

    .line 58
    invoke-virtual/range {v1 .. v7}, LA1/e;->a(LA1/a;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method public final f(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;)LA1/a;
    .locals 6

    .line 1
    sget-object v0, LA1/n;->p:LA1/n;

    .line 2
    .line 3
    invoke-virtual {v0}, LA1/n;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, LA1/a;->o:LA1/a$a;

    .line 12
    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, LA1/a$a;->a(Ljava/lang/String;)LA1/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, LA1/a;->r:LA1/a;

    .line 22
    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sget-object v3, LA1/b;->p:LA1/b$a;

    .line 57
    .line 58
    invoke-virtual {v3, v2}, LA1/b$a;->a(Ljava/lang/String;)LA1/b;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    sget-object v2, LA1/e;->a:LA1/e;

    .line 65
    .line 66
    invoke-virtual {v2, p2, p3, v3, v1}, LA1/e;->g(Ljava/util/Map;Ljava/util/Map;LA1/b;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    sget-object v3, LA1/k;->s:LA1/k;

    .line 71
    .line 72
    invoke-virtual {v3}, LA1/k;->e()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    instance-of v4, v1, Ljava/lang/String;

    .line 81
    .line 82
    sget-object v5, LA1/a;->q:LA1/a;

    .line 83
    .line 84
    if-ne v0, v5, :cond_3

    .line 85
    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    if-eqz v4, :cond_3

    .line 89
    .line 90
    check-cast v1, Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v1}, LA1/e;->k(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    invoke-virtual {p4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    sget-object v3, LA1/e$a;->p:LA1/e$a$a;

    .line 103
    .line 104
    invoke-virtual {v3, v2}, LA1/e$a$a;->a(Ljava/lang/String;)LA1/e$a;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-eqz v3, :cond_1

    .line 109
    .line 110
    invoke-interface {p5, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_4
    return-object v0

    .line 115
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 116
    .line 117
    const-string p2, "null cannot be cast to non-null type kotlin.String"

    .line 118
    .line 119
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p1
.end method

.method public final g(Ljava/util/Map;Ljava/util/Map;LA1/b;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "userData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appData"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "field"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "value"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, LA1/e;->b:Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, LA1/e$c;

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {v0}, LA1/e$c;->b()LA1/k;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v1, LA1/e$e;->b:[I

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    aget v0, v1, v0

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    if-eq v0, v1, :cond_2

    .line 46
    .line 47
    const/4 p2, 0x2

    .line 48
    if-eq v0, p2, :cond_1

    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    invoke-virtual {p0, p1, p3, p4}, LA1/e;->i(Ljava/util/Map;LA1/b;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {p0, p2, p3, p4}, LA1/e;->h(Ljava/util/Map;LA1/b;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    return-void
.end method

.method public final h(Ljava/util/Map;LA1/b;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, LA1/e;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, LA1/e$c;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p2}, LA1/e$c;->a()LA1/l;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    :goto_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-virtual {p2}, LA1/l;->e()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final i(Ljava/util/Map;LA1/b;Ljava/lang/Object;)V
    .locals 4

    .line 1
    sget-object v0, LA1/b;->v:LA1/b;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    sget-object p2, LO1/P;->a:LO1/P;

    .line 6
    .line 7
    new-instance p2, Lorg/json/JSONObject;

    .line 8
    .line 9
    move-object v0, p3

    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {p2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, LO1/P;->n(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catch_0
    move-exception p1

    .line 24
    sget-object p2, LO1/C;->e:LO1/C$a;

    .line 25
    .line 26
    sget-object v0, Lx1/N;->s:Lx1/N;

    .line 27
    .line 28
    const-string v1, "\n transformEvents JSONException: \n%s\n%s"

    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    new-array v2, v2, [Ljava/lang/Object;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    aput-object p3, v2, v3

    .line 35
    .line 36
    const/4 p3, 0x1

    .line 37
    aput-object p1, v2, p3

    .line 38
    .line 39
    const-string p1, "AppEventsConversionsAPITransformer"

    .line 40
    .line 41
    invoke-virtual {p2, v0, p1, v1, v2}, LO1/C$a;->c(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    sget-object v0, LA1/e;->b:Ljava/util/Map;

    .line 46
    .line 47
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    check-cast p2, LA1/e$c;

    .line 52
    .line 53
    if-nez p2, :cond_1

    .line 54
    .line 55
    const/4 p2, 0x0

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {p2}, LA1/e$c;->a()LA1/l;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    :goto_0
    if-nez p2, :cond_2

    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    invoke-virtual {p2}, LA1/l;->e()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :goto_1
    return-void
.end method

.method public final j(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, LA1/e;->d:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, LA1/j;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const-string p1, ""

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, LA1/j;->e()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :cond_1
    :goto_0
    return-object p1
.end method

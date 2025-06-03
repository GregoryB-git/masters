.class public final Lhb/h;
.super Lgb/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhb/h$b;,
        Lhb/h$a;
    }
.end annotation


# static fields
.field public static final p:Lxc/f;


# instance fields
.field public final h:Leb/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/t0<",
            "**>;"
        }
    .end annotation
.end field

.field public final i:Ljava/lang/String;

.field public final j:Lgb/l3;

.field public k:Ljava/lang/String;

.field public final l:Lhb/h$b;

.field public final m:Lhb/h$a;

.field public final n:Leb/a;

.field public o:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxc/f;

    invoke-direct {v0}, Lxc/f;-><init>()V

    sput-object v0, Lhb/h;->p:Lxc/f;

    return-void
.end method

.method public constructor <init>(Leb/t0;Leb/s0;Lhb/b;Lhb/i;Lhb/p;Ljava/lang/Object;IILjava/lang/String;Ljava/lang/String;Lgb/l3;Lgb/r3;Leb/c;Z)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/t0<",
            "**>;",
            "Leb/s0;",
            "Lhb/b;",
            "Lhb/i;",
            "Lhb/p;",
            "Ljava/lang/Object;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lgb/l3;",
            "Lgb/r3;",
            "Leb/c;",
            "Z)V"
        }
    .end annotation

    move-object v9, p0

    move-object v7, p1

    new-instance v1, Leb/y;

    invoke-direct {v1}, Leb/y;-><init>()V

    const/4 v8, 0x0

    if-eqz p14, :cond_0

    .line 1
    iget-boolean v0, v7, Leb/t0;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v6, v0

    goto :goto_0

    :cond_0
    move v6, v8

    :goto_0
    move-object v0, p0

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    move-object v4, p2

    move-object/from16 v5, p13

    .line 2
    invoke-direct/range {v0 .. v6}, Lgb/a;-><init>(Leb/y;Lgb/l3;Lgb/r3;Leb/s0;Leb/c;Z)V

    new-instance v0, Lhb/h$a;

    invoke-direct {v0, p0}, Lhb/h$a;-><init>(Lhb/h;)V

    iput-object v0, v9, Lhb/h;->m:Lhb/h$a;

    iput-boolean v8, v9, Lhb/h;->o:Z

    move-object/from16 v3, p11

    iput-object v3, v9, Lhb/h;->j:Lgb/l3;

    iput-object v7, v9, Lhb/h;->h:Leb/t0;

    move-object/from16 v0, p9

    iput-object v0, v9, Lhb/h;->k:Ljava/lang/String;

    move-object/from16 v0, p10

    iput-object v0, v9, Lhb/h;->i:Ljava/lang/String;

    move-object v8, p4

    .line 3
    iget-object v0, v8, Lhb/i;->u:Leb/a;

    .line 4
    iput-object v0, v9, Lhb/h;->n:Leb/a;

    new-instance v10, Lhb/h$b;

    .line 5
    iget-object v0, v7, Leb/t0;->b:Ljava/lang/String;

    move-object v0, v10

    move-object v1, p0

    move/from16 v2, p7

    move-object/from16 v4, p6

    move-object v5, p3

    move-object/from16 v6, p5

    move-object v7, p4

    move/from16 v8, p8

    .line 6
    invoke-direct/range {v0 .. v8}, Lhb/h$b;-><init>(Lhb/h;ILgb/l3;Ljava/lang/Object;Lhb/b;Lhb/p;Lhb/i;I)V

    iput-object v10, v9, Lhb/h;->l:Lhb/h$b;

    return-void
.end method


# virtual methods
.method public final k(Ljava/lang/String;)V
    .locals 1

    const-string v0, "authority"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lhb/h;->k:Ljava/lang/String;

    return-void
.end method

.method public final q()Lgb/d$a;
    .locals 1

    iget-object v0, p0, Lhb/h;->l:Lhb/h$b;

    return-object v0
.end method

.method public final r()Lhb/h$a;
    .locals 1

    iget-object v0, p0, Lhb/h;->m:Lhb/h$a;

    return-object v0
.end method

.method public final s()Lhb/h$b;
    .locals 1

    iget-object v0, p0, Lhb/h;->l:Lhb/h$b;

    return-object v0
.end method

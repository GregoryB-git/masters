.class public final Ld5/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lv3/i0;

.field public final b:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Ld5/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ld5/k;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La4/d$b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ld5/e;",
            ">;"
        }
    .end annotation
.end field

.field public final g:J

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld5/e;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld5/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv3/i0;Ljava/util/List;Ld5/k;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/d$a;->a:Lv3/i0;

    invoke-static {p2}, Lo7/t;->p(Ljava/util/Collection;)Lo7/t;

    move-result-object p1

    iput-object p1, p0, Ld5/d$a;->b:Lo7/t;

    iput-object p3, p0, Ld5/d$a;->c:Ld5/k;

    iput-object p4, p0, Ld5/d$a;->d:Ljava/lang/String;

    iput-object p5, p0, Ld5/d$a;->e:Ljava/util/ArrayList;

    iput-object p6, p0, Ld5/d$a;->f:Ljava/util/ArrayList;

    iput-object p7, p0, Ld5/d$a;->h:Ljava/util/List;

    iput-object p8, p0, Ld5/d$a;->i:Ljava/util/List;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Ld5/d$a;->g:J

    return-void
.end method

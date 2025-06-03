.class public final Lv3/o0$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/o0$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/util/UUID;

.field public b:Landroid/net/Uri;

.field public c:Lo7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/u<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public h:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lo7/m0;->o:Lo7/m0;

    .line 3
    iput-object v0, p0, Lv3/o0$d$a;->c:Lo7/u;

    sget-object v0, Lo7/t;->b:Lo7/t$b;

    .line 4
    sget-object v0, Lo7/l0;->e:Lo7/l0;

    .line 5
    iput-object v0, p0, Lv3/o0$d$a;->g:Lo7/t;

    return-void
.end method

.method public constructor <init>(Lv3/o0$d;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lv3/o0$d;->a:Ljava/util/UUID;

    iput-object v0, p0, Lv3/o0$d$a;->a:Ljava/util/UUID;

    iget-object v0, p1, Lv3/o0$d;->b:Landroid/net/Uri;

    iput-object v0, p0, Lv3/o0$d$a;->b:Landroid/net/Uri;

    iget-object v0, p1, Lv3/o0$d;->c:Lo7/u;

    iput-object v0, p0, Lv3/o0$d$a;->c:Lo7/u;

    iget-boolean v0, p1, Lv3/o0$d;->d:Z

    iput-boolean v0, p0, Lv3/o0$d$a;->d:Z

    iget-boolean v0, p1, Lv3/o0$d;->e:Z

    iput-boolean v0, p0, Lv3/o0$d$a;->e:Z

    iget-boolean v0, p1, Lv3/o0$d;->f:Z

    iput-boolean v0, p0, Lv3/o0$d$a;->f:Z

    iget-object v0, p1, Lv3/o0$d;->g:Lo7/t;

    iput-object v0, p0, Lv3/o0$d$a;->g:Lo7/t;

    .line 7
    iget-object p1, p1, Lv3/o0$d;->h:[B

    .line 8
    iput-object p1, p0, Lv3/o0$d$a;->h:[B

    return-void
.end method

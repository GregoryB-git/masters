.class public final Lq/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Lp/o$d;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lq/a;

.field public e:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp/o$d;

    invoke-direct {v0}, Lp/o$d;-><init>()V

    iput-object v0, p0, Lq/c;->b:Lp/o$d;

    new-instance v0, Lq/a$a;

    invoke-direct {v0}, Lq/a$a;-><init>()V

    iput-object v0, p0, Lq/c;->d:Lq/a;

    const/4 v0, 0x0

    iput v0, p0, Lq/c;->e:I

    iput-object p1, p0, Lq/c;->a:Landroid/net/Uri;

    return-void
.end method

.class public Lu5/L$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu5/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu5/L$c$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/view/KeyEvent;

.field public b:I

.field public c:Z

.field public final synthetic d:Lu5/L;


# direct methods
.method public constructor <init>(Lu5/L;Landroid/view/KeyEvent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu5/L$c;->d:Lu5/L;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lu5/L;->a:[Lu5/L$d;

    .line 7
    .line 8
    array-length p1, p1

    .line 9
    iput p1, p0, Lu5/L$c;->b:I

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lu5/L$c;->c:Z

    .line 13
    .line 14
    iput-object p2, p0, Lu5/L$c;->a:Landroid/view/KeyEvent;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()Lu5/L$d$a;
    .locals 2

    .line 1
    new-instance v0, Lu5/L$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lu5/L$c$a;-><init>(Lu5/L$c;Lu5/L$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

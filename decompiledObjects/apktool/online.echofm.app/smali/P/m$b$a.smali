.class public final LP/m$b$a;
.super LP/m$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP/m$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LP/n;


# direct methods
.method public constructor <init>(LP/n;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LP/m$b;-><init>(Lkotlin/jvm/internal/g;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LP/m$b$a;->a:LP/n;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a()LP/n;
    .locals 1

    .line 1
    iget-object v0, p0, LP/m$b$a;->a:LP/n;

    .line 2
    .line 3
    return-object v0
.end method

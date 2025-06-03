.class public final synthetic LH1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG1/k$a;


# instance fields
.field public final synthetic a:LH1/f$b;

.field public final synthetic b:LH1/b;


# direct methods
.method public synthetic constructor <init>(LH1/f$b;LH1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH1/h;->a:LH1/f$b;

    .line 5
    .line 6
    iput-object p2, p0, LH1/h;->b:LH1/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;)V
    .locals 2

    .line 1
    iget-object v0, p0, LH1/h;->a:LH1/f$b;

    .line 2
    .line 3
    iget-object v1, p0, LH1/h;->b:LH1/b;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LH1/f$b$a;->b(LH1/f$b;LH1/b;Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

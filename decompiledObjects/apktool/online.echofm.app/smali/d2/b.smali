.class public final synthetic Ld2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/a;


# instance fields
.field public final synthetic a:Ld2/d;


# direct methods
.method public synthetic constructor <init>(Ld2/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld2/b;->a:Ld2/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld2/b;->a:Ld2/d;

    .line 2
    .line 3
    check-cast p1, Ld2/d$a;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ld2/d;->c(Ld2/d;Ld2/d$a;)Ld2/d$b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

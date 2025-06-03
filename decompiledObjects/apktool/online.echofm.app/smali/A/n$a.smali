.class public LA/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/n$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/n;->g([LF/g$b;I)LF/g$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LA/n;


# direct methods
.method public constructor <init>(LA/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA/n$a;->a:LA/n;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LF/g$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA/n$a;->c(LF/g$b;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, LF/g$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA/n$a;->d(LF/g$b;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(LF/g$b;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, LF/g$b;->e()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public d(LF/g$b;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, LF/g$b;->f()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

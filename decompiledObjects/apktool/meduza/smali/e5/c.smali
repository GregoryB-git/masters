.class public final Le5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/h;


# instance fields
.field public final a:Lt5/k$a;


# direct methods
.method public constructor <init>(Lt5/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/c;->a:Lt5/k$a;

    return-void
.end method


# virtual methods
.method public final a()Lt5/k;
    .locals 1

    iget-object v0, p0, Le5/c;->a:Lt5/k$a;

    invoke-interface {v0}, Lt5/k$a;->a()Lt5/k;

    move-result-object v0

    return-object v0
.end method

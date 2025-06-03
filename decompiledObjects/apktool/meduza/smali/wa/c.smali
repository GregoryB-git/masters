.class public final Lwa/c;
.super Lwa/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwa/c$a;
    }
.end annotation


# instance fields
.field public final b:Lwa/c$a;

.field public final c:Lio/flutter/plugin/common/MethodCall;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Lwa/a;-><init>()V

    iput-object p1, p0, Lwa/c;->c:Lio/flutter/plugin/common/MethodCall;

    new-instance p1, Lwa/c$a;

    invoke-direct {p1, p2}, Lwa/c$a;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    iput-object p1, p0, Lwa/c;->b:Lwa/c$a;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lwa/c;->c:Lio/flutter/plugin/common/MethodCall;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwa/c;->c:Lio/flutter/plugin/common/MethodCall;

    iget-object v0, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, Lwa/c;->c:Lio/flutter/plugin/common/MethodCall;

    const-string v1, "transactionId"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->hasArgument(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final v()Lwa/d;
    .locals 1

    iget-object v0, p0, Lwa/c;->b:Lwa/c$a;

    return-object v0
.end method

.class public final synthetic Ln9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic a:Ln9/a$b;


# direct methods
.method public synthetic constructor <init>(Ln9/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln9/b;->a:Ln9/a$b;

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Ln9/b;->a:Ln9/a$b;

    iget-object p1, p1, Ln9/a$b;->d:Ln9/a;

    invoke-virtual {p1, p2}, Ln9/a;->c(Ljava/lang/Throwable;)V

    return-void
.end method

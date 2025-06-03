.class public abstract Lcom/google/firebase/messaging/M;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm4/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lm4/h;->a()Lm4/h$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/messaging/a;->a:Lk4/a;

    invoke-virtual {v0, v1}, Lm4/h$a;->d(Lk4/a;)Lm4/h$a;

    move-result-object v0

    invoke-virtual {v0}, Lm4/h$a;->c()Lm4/h;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/M;->a:Lm4/h;

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/messaging/M;->a:Lm4/h;

    invoke-virtual {v0, p0}, Lm4/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method

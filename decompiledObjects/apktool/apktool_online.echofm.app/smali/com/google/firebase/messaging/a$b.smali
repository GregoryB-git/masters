.class public final Lcom/google/firebase/messaging/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj4/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/messaging/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lcom/google/firebase/messaging/a$b;

.field public static final b:Lj4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/firebase/messaging/a$b;

    invoke-direct {v0}, Lcom/google/firebase/messaging/a$b;-><init>()V

    sput-object v0, Lcom/google/firebase/messaging/a$b;->a:Lcom/google/firebase/messaging/a$b;

    const-string v0, "messagingClientEvent"

    invoke-static {v0}, Lj4/c;->a(Ljava/lang/String;)Lj4/c$b;

    move-result-object v0

    invoke-static {}, Lm4/a;->b()Lm4/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lm4/a;->c(I)Lm4/a;

    move-result-object v1

    invoke-virtual {v1}, Lm4/a;->a()Lm4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj4/c$b;->b(Ljava/lang/annotation/Annotation;)Lj4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lj4/c$b;->a()Lj4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$b;->b:Lj4/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ly4/b;

    check-cast p2, Lj4/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/messaging/a$b;->b(Ly4/b;Lj4/e;)V

    return-void
.end method

.method public b(Ly4/b;Lj4/e;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/messaging/a$b;->b:Lj4/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Ly4/b;->a()Ly4/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p2, v0, p1}, Lj4/e;->g(Lj4/c;Ljava/lang/Object;)Lj4/e;

    .line 8
    .line 9
    .line 10
    return-void
.end method

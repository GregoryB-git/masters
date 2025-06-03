.class public abstract Lec/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljc/b;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lec/b$a;
    }
.end annotation


# static fields
.field public static final NO_RECEIVER:Ljava/lang/Object;


# instance fields
.field private final isTopLevel:Z

.field private final name:Ljava/lang/String;

.field private final owner:Ljava/lang/Class;

.field public final receiver:Ljava/lang/Object;

.field private transient reflected:Ljc/b;

.field private final signature:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lec/b$a;->a:Lec/b$a;

    sput-object v0, Lec/b;->NO_RECEIVER:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lec/b;->NO_RECEIVER:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lec/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lec/b;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec/b;->receiver:Ljava/lang/Object;

    iput-object p2, p0, Lec/b;->owner:Ljava/lang/Class;

    iput-object p3, p0, Lec/b;->name:Ljava/lang/String;

    iput-object p4, p0, Lec/b;->signature:Ljava/lang/String;

    iput-boolean p5, p0, Lec/b;->isTopLevel:Z

    return-void
.end method


# virtual methods
.method public varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lec/b;->getReflected()Ljc/b;

    move-result-object v0

    invoke-interface {v0, p1}, Ljc/b;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public callBy(Ljava/util/Map;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lec/b;->getReflected()Ljc/b;

    move-result-object v0

    invoke-interface {v0, p1}, Ljc/b;->callBy(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public compute()Ljc/b;
    .locals 1

    iget-object v0, p0, Lec/b;->reflected:Ljc/b;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lec/b;->computeReflected()Ljc/b;

    move-result-object v0

    iput-object v0, p0, Lec/b;->reflected:Ljc/b;

    :cond_0
    return-object v0
.end method

.method public abstract computeReflected()Ljc/b;
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lec/b;->getReflected()Ljc/b;

    move-result-object v0

    invoke-interface {v0}, Ljc/a;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getBoundReceiver()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lec/b;->receiver:Ljava/lang/Object;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lec/b;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOwner()Ljc/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lec/b;->owner:Ljava/lang/Class;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-boolean v1, p0, Lec/b;->isTopLevel:Z

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    sget-object v1, Lec/t;->a:Lec/u;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v1, Lec/k;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lec/k;-><init>(Ljava/lang/Class;)V

    .line 19
    .line 20
    .line 21
    move-object v0, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {v0}, Lec/t;->a(Ljava/lang/Class;)Lec/d;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    return-object v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public getParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lec/b;->getReflected()Ljc/b;

    move-result-object v0

    invoke-interface {v0}, Ljc/b;->getParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getReflected()Ljc/b;
    .locals 1

    invoke-virtual {p0}, Lec/b;->compute()Ljc/b;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcc/a;

    invoke-direct {v0}, Lcc/a;-><init>()V

    throw v0
.end method

.method public getReturnType()Ljc/i;
    .locals 1

    invoke-virtual {p0}, Lec/b;->getReflected()Ljc/b;

    move-result-object v0

    invoke-interface {v0}, Ljc/b;->getReturnType()Ljc/i;

    move-result-object v0

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lec/b;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lec/b;->getReflected()Ljc/b;

    move-result-object v0

    invoke-interface {v0}, Ljc/b;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getVisibility()Ljc/j;
    .locals 1

    invoke-virtual {p0}, Lec/b;->getReflected()Ljc/b;

    move-result-object v0

    invoke-interface {v0}, Ljc/b;->getVisibility()Ljc/j;

    move-result-object v0

    return-object v0
.end method

.method public isAbstract()Z
    .locals 1

    invoke-virtual {p0}, Lec/b;->getReflected()Ljc/b;

    move-result-object v0

    invoke-interface {v0}, Ljc/b;->isAbstract()Z

    move-result v0

    return v0
.end method

.method public isFinal()Z
    .locals 1

    invoke-virtual {p0}, Lec/b;->getReflected()Ljc/b;

    move-result-object v0

    invoke-interface {v0}, Ljc/b;->isFinal()Z

    move-result v0

    return v0
.end method

.method public isOpen()Z
    .locals 1

    invoke-virtual {p0}, Lec/b;->getReflected()Ljc/b;

    move-result-object v0

    invoke-interface {v0}, Ljc/b;->isOpen()Z

    move-result v0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    invoke-virtual {p0}, Lec/b;->getReflected()Ljc/b;

    move-result-object v0

    invoke-interface {v0}, Ljc/b;->isSuspend()Z

    move-result v0

    return v0
.end method

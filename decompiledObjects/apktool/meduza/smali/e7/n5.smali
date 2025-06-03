.class public final synthetic Le7/n5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic a:Le7/m5;

.field public synthetic b:I

.field public synthetic c:Le7/a1;

.field public synthetic d:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Le7/m5;ILe7/a1;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/n5;->a:Le7/m5;

    iput p2, p0, Le7/n5;->b:I

    iput-object p3, p0, Le7/n5;->c:Le7/a1;

    iput-object p4, p0, Le7/n5;->d:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Le7/n5;->a:Le7/m5;

    .line 2
    .line 3
    iget v1, p0, Le7/n5;->b:I

    .line 4
    .line 5
    iget-object v2, p0, Le7/n5;->c:Le7/a1;

    .line 6
    .line 7
    iget-object v3, p0, Le7/n5;->d:Landroid/content/Intent;

    .line 8
    .line 9
    iget-object v4, v0, Le7/m5;->a:Landroid/content/Context;

    .line 10
    .line 11
    check-cast v4, Le7/o5;

    .line 12
    .line 13
    invoke-interface {v4, v1}, Le7/o5;->zza(I)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-object v2, v2, Le7/a1;->w:Le7/b1;

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v4, "Local AppMeasurementService processed last upload request. StartId"

    .line 26
    .line 27
    invoke-virtual {v2, v4, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Le7/m5;->b()Le7/a1;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v1, v1, Le7/a1;->w:Le7/b1;

    .line 35
    .line 36
    const-string v2, "Completed wakeful intent."

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Le7/b1;->b(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, Le7/m5;->a:Landroid/content/Context;

    .line 42
    .line 43
    check-cast v0, Le7/o5;

    .line 44
    .line 45
    invoke-interface {v0, v3}, Le7/o5;->a(Landroid/content/Intent;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
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
